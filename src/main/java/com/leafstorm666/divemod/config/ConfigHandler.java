package com.leafstorm666.divemod.config;



import java.io.File;
import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {



    public static void init(File configFile)
    {
        //create configuration object from config file
        Configuration config = new Configuration(configFile);

        try
        {
            //load config
            config.load();

            //read in properties

        }
        catch (Exception e)
        {
            //log exception

        }
        finally
        {
            //save config file
            config.save();
        }
    }
}
