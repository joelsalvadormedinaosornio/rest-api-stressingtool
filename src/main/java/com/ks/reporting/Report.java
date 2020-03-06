package com.ks.reporting;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Report {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");

    public static Report getInstance() {
        return ourInstance;
    }

    private static Report ourInstance = new Report();
    private static BufferedWriter writer;

    private Report() {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
            writer = new BufferedWriter(new FileWriter("./config/output/" + "Report_" + dateFormat.format(new Date()) + ".csv", true));
            writer.write("trxID,request,response,time,error\n");
        } catch (Exception e) {
            System.out.println("Error al crear el reporte de respuestas debido a: " + Arrays.toString(e.getStackTrace()));
            System.exit(-1);
        }
    }

    public void save(String id, String request, String response, boolean error) {
        try {
            synchronized (writer) {
                response = response != null ? response.replaceAll(",", " ").replaceAll("\n", " ") : "";
                writer.write(id + "," + request + "," + response + ", " + dateFormat.format(new Date()) + ", " + error + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error al almacenar en reporte: " + id + "," + response + "," + dateFormat.format(new Date()) + "," + error + "\n" + e.getMessage());
        }
    }

    public void close() {
        try {
            writer.close();
        } catch (IOException e) {
            System.out.println("Error al cerrar reporte");
        }
    }
}
