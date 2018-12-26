package com.teamdev.thechillager.client;

import com.teamdev.thechillager.TheChillager;
import com.teamdev.thechillager.init.ModItems;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(modid = TheChillager.MODID, value = Side.CLIENT)
public class ModelRegisterHandler {

	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(ModItems.GINGERBREAD_NOTCH, 0, new ModelResourceLocation(ModItems.GINGERBREAD_NOTCH.getRegistryName(), "inventory"));
	}
	
}
