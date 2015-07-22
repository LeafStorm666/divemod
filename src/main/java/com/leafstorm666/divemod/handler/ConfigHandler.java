package com.leafstorm666.divemod.handler;



import java.io.File;

import com.leafstorm666.divemod.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {

    public static Configuration config;

    //define any config values here
    public static boolean testValue = false;

    public static void init(File configFile)
    {

        //create configuration object from config file
        if(config == null)
        {
            config = new Configuration(configFile);
            loadConfig();
        }


    }
    private static void loadConfig() {

        testValue = config.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "example config option to test stuff.");

        if (config.hasChanged()) {
            config.save();
        }
    }
    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfig();
        }
    }

}
