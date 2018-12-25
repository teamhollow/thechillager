package com.teamdev.thechillager;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

import com.teamdev.thechillager.proxy.CommonProxy;

@Mod(modid = TheChillager.MODID, name = TheChillager.NAME, version = TheChillager.VERSION)
public class TheChillager {
	public static final String MODID = "thechillager";
	public static final String NAME = "The Chillager";
	public static final String VERSION = "1.12.2-1.0.0";

	public static Logger logger;

	@SidedProxy(clientSide = "com.teamdev.thechillager.proxy.ClientProxy", serverSide = "com.teamdev.thechillager.proxy.ServerProxy")
	public static CommonProxy proxy;

	@Mod.Instance
	public static TheChillager instance;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
	}
}
