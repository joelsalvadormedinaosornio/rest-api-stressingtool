package com.ks.configuation;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Configuration
{

    public static void readConfig(String fileName)
    {
        try
        {
            final ObjectMapper mapper = new ObjectMapper();
            mapper.readValue(new File("./config/" + fileName + ".json"), ConfigurationData.class);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
