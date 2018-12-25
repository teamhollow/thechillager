package com.teamdev.thechillager.init;

import com.teamdev.thechillager.TheChillager;
import com.teamdev.thechillager.items.ItemGingerbreadNotch;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@Mod.EventBusSubscriber
@ObjectHolder(TheChillager.MODID)
public class ModItems {

	public static final Item GINGERBREAD_NOTCH = null;
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(
				new ItemGingerbreadNotch(4, 1.2F, false).setRegistryName("gingerbread_notch").setTranslationKey(TheChillager.MODID + ".gingerbread_notch"));
	}
	
}
