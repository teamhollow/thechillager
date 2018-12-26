package com.teamdev.thechillager.proxy;

import net.minecraftforge.fml.relauncher.Side;

public class ClientProxy extends CommonProxy {

	@Override
	public Side getSide() {
		return Side.CLIENT;
	}

}
