package com.ks;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ks.admin.Stats;
import com.ks.configuation.ConfigurationData;
import com.ks.configuation.Host;
import com.ks.reporting.Report;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class App {
    private static final SimpleDateFormat sd = new SimpleDateFormat("HH:mm:ss.SSS");

    private static final ObjectMapper mapper = new ObjectMapper();
    private static ConfigurationData configurationData;
    private int cont = 0;

    public static void main(String[] args) {
        try {
            configurationData = mapper.readValue(new File("./config/" + args[0] + ".json"), ConfigurationData.class);
            Stats.started();
            new App().start();
        } catch (Exception e) {
            System.out.println("Error durante la ejecucion: " + e.getMessage() + " localizado en: " + Arrays.toString(e.getStackTrace()));
            System.exit(-1);
        }
    }

    private void start() throws InterruptedException {
        for (Host host : configurationData.getHosts()) {
            for (String transactionRequest : host.getTransactions()) {
                for (int second = 0; second < host.getStressingSeconds(); second++) {
                    for (int tranNumber = 1; tranNumber <= host.getTransactionsPerSecond(); tranNumber++) {
                        new Thread(() -> this.send(transactionRequest, host)).start();
                        Thread.sleep(10);
                    }
                    Thread.sleep(1000);
                }
            }

            Thread.sleep(3000);
        }

        Report.getInstance().close();
        Stats.finished();
        System.out.println(Stats.getData());
    }

    private void send(String request, Host host) {
        String trxId = String.format("%012d", new Random().nextInt(Integer.MAX_VALUE));
        String url = "http://" + host.getIp() + ":" + host.getPort() + host.getBasePath() + host.getPath() + request;

        try {
            RestTemplate restTemplate = new RestTemplate();
            Stats.newRequest();
            cont++;
            System.out.println("Request:\t" + cont + " " + trxId + " - " + sd.format(new Date()));
            ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
            Stats.newResponse();
            System.out.println("Response:\t" + trxId + " - " + sd.format(new Date()) + responseEntity.getBody());
            Report.getInstance().save(trxId, request, responseEntity.getBody(), false);
        } catch (Exception e) {
            Stats.newError();
            System.out.println("Generic error transaction id: " + trxId + "Error: " + e.toString() + e.getMessage());
            Report.getInstance().save(trxId, request, e.toString(), true);
        }
    }
}
