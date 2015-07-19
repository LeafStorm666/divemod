package com.leafstorm666.divemod;


import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "divemod", name ="Dive Mod", version = "1.7.10-0.1")
public class divemod
{
    @Mod.Instance("divemod")
    public static divemod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {}

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {}

    @Mod.EventHandler
    public void init(FMLPostInitializationEvent event)
    {}

}
