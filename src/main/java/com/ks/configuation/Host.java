package com.ks.configuation;


import java.util.List;

public class Host
{

    private String ip;
    private String port;
    private String basePath;
    private String hostname;
    private String path;
    private int transactionsPerSecond;
    private int stressingSeconds;
    private List<String> transactions;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getBasePath() {
        return basePath;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    public String getHostname()
    {
        return hostname;
    }

    public void setHostname(String hostname)
    {
        this.hostname = hostname;
    }

    public String getPath()
    {
        return path;
    }

    public void setPath(String path)
    {
        this.path = path;
    }

    public int getTransactionsPerSecond()
    {
        return transactionsPerSecond;
    }

    public void setTransactionsPerSecond(int transactionsPerSecond)
    {
        this.transactionsPerSecond = transactionsPerSecond;
    }

    public List<String> getTransactions()
    {
        return transactions;
    }

    public void setTransactions(List<String> transactions)
    {
        this.transactions = transactions;
    }

    public int getStressingSeconds()
    {
        return stressingSeconds;
    }

    public void setStressingSeconds(int stressingSeconds)
    {
        this.stressingSeconds = stressingSeconds;
    }
}
