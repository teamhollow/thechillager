package com.teamdev.thechillager.client.renders;

import com.teamdev.thechillager.client.renders.entities.RenderChillager;
import com.teamdev.thechillager.entities.EntityChillager;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderRegistry 
{

	public static void initEntities()
	{
		register(EntityChillager.class, RenderChillager.class);

	}

	private static<T extends Entity> void register(Class<T> clazz, Class<? extends Render<T>> render)
	{
		RenderingRegistry.registerEntityRenderingHandler(clazz, new IRenderFactory<T>() 
		{
			@Override
			public Render<T> createRenderFor(RenderManager manager) 
			{
				try 
				{
					return render.getConstructor(RenderManager.class).newInstance(manager);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}

				return null;
			}
		});
	}

}