package com.teamdev.thechillager.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemGingerbreadNotch extends ItemFood {

	public ItemGingerbreadNotch(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
	}

	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		if (!worldIn.isRemote) {
			player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 400, 1));
			player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 6000, 0));
			player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 6000, 0));
			player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 2400, 3));
			player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 2400, 1));
		}
	}

}
