package com.ks.admin;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Stats
{
    private static final SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd HH:mm:ss.SSS");
    private static String startedAt;
    private static String finishedAt;
    private static int requested = 0;
    private static int responded = 0;
    private static int error = 0;

    public static void newRequest()
    {
        requested++;
    }

    public static void newResponse()
    {
        responded++;
    }

    public static void newError()
    {
        error++;
    }

    public static void started()
    {
        startedAt = df.format(new Date());
    }

    public static void finished()
    {
        finishedAt = df.format(new Date());
    }

    public static String getData()
    {
        return "\n\nTesting: " + new Date() + "\n\nStarted at: " + startedAt + "\n" +
                "Finished at: " + finishedAt + "\n" + "Requested: " + requested + "\n" +
                "Responded: " + responded + "\n" + "Error: " + error + "\n";
    }
}
