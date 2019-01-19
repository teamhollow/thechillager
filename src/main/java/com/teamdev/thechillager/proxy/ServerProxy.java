package com.teamdev.thechillager.proxy;

import net.minecraftforge.fml.relauncher.Side;

public class ServerProxy extends CommonProxy {

	@Override
	public Side getSide() {
		return Side.SERVER;
	}
	
	@Override
	public void preInit() {
	}

	@Override
	public void init() {
	}
	
}
