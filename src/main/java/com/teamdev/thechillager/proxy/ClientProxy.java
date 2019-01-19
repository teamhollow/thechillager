package com.teamdev.thechillager.proxy;

import com.teamdev.thechillager.client.renders.RenderRegistry;

import net.minecraftforge.fml.relauncher.Side;

public class ClientProxy extends CommonProxy {

	@Override
	public Side getSide() {
		return Side.CLIENT;
	}
	
	@Override
	public void preInit() {
		RenderRegistry.initEntities();
	}

	@Override
	public void init() {
	}

}
