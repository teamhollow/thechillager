package com.teamdev.thechillager.init;

import com.teamdev.thechillager.TheChillager;
import com.teamdev.thechillager.entities.EntityChillager;

import net.minecraft.entity.Entity;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities
{
	private static int modEntityId;
	
	public static void initialization() {
		register("chillager_illager", EntityChillager.class, 9804699, 0x4f321d);
	}
	
	private static void register(String entityName, Class<? extends Entity> clazz, int primaryEggColor, int secondaryEggColor) {
		EntityRegistry.registerModEntity(TheChillager.locate(entityName), clazz, entityName, modEntityId, TheChillager.instance, 80, 3, false, primaryEggColor, secondaryEggColor);

		modEntityId++;
	}

	@SuppressWarnings("unused")
	private static void register(String entityName, Class<? extends Entity> clazz) {
		EntityRegistry.registerModEntity(TheChillager.locate(entityName), clazz, entityName, modEntityId, TheChillager.instance, 64, 3, false);

		modEntityId++;
	}
}