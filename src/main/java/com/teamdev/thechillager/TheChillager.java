package com.teamdev.thechillager;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = TheChillager.MODID, name = TheChillager.NAME, version = TheChillager.VERSION)
public class TheChillager {
    static final String MODID = "thechillager";
    static final String NAME = "The Chillager";
    static final String VERSION = "1.12.2-1.0.0";

    static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
    }
}
