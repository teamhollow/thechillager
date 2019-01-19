package com.teamdev.thechillager.client.renders.entities;

import com.teamdev.thechillager.client.models.entity.ModelChillager;
import com.teamdev.thechillager.entities.EntityChillager;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumHandSide;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderChillager extends RenderLiving<EntityChillager>
{
	private static final ResourceLocation CHILLAGER_TEXTURE = new ResourceLocation("thechillager", "textures/entity/chillager.png");

	
    public RenderChillager(RenderManager p_i47189_1_)
    {
        super(p_i47189_1_, new ModelChillager(), 0.7F);
        this.addLayer(new LayerHeldItem(this)
        {
            public void doRenderLayer(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
            {
            	super.doRenderLayer(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTicks, ageInTicks, netHeadYaw, headPitch, scale);
            }
            protected void translateToHand(EnumHandSide hand)
            {
                ((ModelChillager)this.livingEntityRenderer.getMainModel()).RightArm.postRender(0.0625F);
            }
        });
    }

    public void doRender(EntityChillager entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    protected ResourceLocation getEntityTexture(EntityChillager entity)
    {
        return CHILLAGER_TEXTURE;
    }

    protected void preRenderCallback(EntityChillager entitylivingbaseIn, float partialTickTime)
    {
    }
}