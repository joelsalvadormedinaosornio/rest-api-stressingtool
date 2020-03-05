package com.ks.admin;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * {@link Stats}
 *
 * @author Marco Calzada
 * @version 1
 * @since 30/05/2019
 */
public class Stats
{
    private static final SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd HH:mm:ss.SSS");
    private static String startedAt;
    private static String finishedAt;
    private static int requested = 0;
    private static int responded = 0;
    private static int error = 0;
    private static int duplciated = 0;

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

    public static void newDuplicated()
    {
        duplciated++;
    }

    public static boolean missingTrans()
    {
        return responded + error + duplciated < requested;
    }

    public static void started()
    {
        startedAt = df.format(new Date());
    }

    public static void finished()
    {
        finishedAt = df.format(new Date());
    }

    private static String getData()
    {
        return "\n\nTesting: " + new Date() + "\n\nStarted at: " + startedAt + "\n" +

                "Finished at: " + finishedAt + "\n" + "Requested: " + requested + "\n" +

                "Responded: " + responded + "\n" + "Error: " + error + "\n" + "Duplicated: " + duplciated + "\n";
    }

    public static void printResult() throws IOException
    {
        System.out.println(getData());
        File output = new File("./config/out/output.txt");

        if (!output.exists())
        {
            output.createNewFile();
        }

        BufferedWriter bf = new BufferedWriter(new FileWriter(output));

        bf.write(getData());

        bf.close();
    }
}
