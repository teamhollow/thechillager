package com.teamdev.thechillager.client.models.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelChillager - Undefined
 * Created using Tabula 7.0.0
 */
public class ModelChillager extends ModelBase {
    public ModelRenderer RightLeg;
    public ModelRenderer LeftLeg;
    public ModelRenderer Body;
    public ModelRenderer RightArm;
    public ModelRenderer LeftArm;
    public ModelRenderer Head;
    public ModelRenderer RightShoe;
    public ModelRenderer LeftShoe;
    public ModelRenderer Hat1;
    public ModelRenderer Nose;
    public ModelRenderer Hat2;
    public ModelRenderer Hat3;
    public ModelRenderer Hat4;

    public ModelChillager() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.RightShoe = new ModelRenderer(this, 43, 35);
        this.RightShoe.setRotationPoint(0.0F, 13.0F, 0.0F);
        this.RightShoe.addBox(-3.0F, 0.0F, -4.0F, 6, 3, 7, 0.0F);
        this.LeftShoe = new ModelRenderer(this, 43, 35);
        this.LeftShoe.mirror = true;
        this.LeftShoe.setRotationPoint(0.0F, 13.0F, 0.0F);
        this.LeftShoe.addBox(-3.0F, 0.0F, -4.0F, 6, 3, 7, 0.0F);
        this.Hat4 = new ModelRenderer(this, 88, 0);
        this.Hat4.setRotationPoint(0.0F, -5.5F, 2.0F);
        this.Hat4.addBox(-1.5F, -3.0F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(Hat4, 0.7853981633974483F, 0.17453292519943295F, 0.0F);
        this.Head = new ModelRenderer(this, 0, 20);
        this.Head.setRotationPoint(0.0F, -8.0F, 0.0F);
        this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.LeftArm = new ModelRenderer(this, 66, 41);
        this.LeftArm.mirror = true;
        this.LeftArm.setRotationPoint(7.0F, -6.0F, 0.0F);
        this.LeftArm.addBox(-1.0F, -2.0F, -2.5F, 5, 18, 5, 0.0F);
        this.setRotateAngle(LeftArm, 0.0F, 0.0F, -0.08726646259971647F);
        this.Hat2 = new ModelRenderer(this, 36, 0);
        this.Hat2.setRotationPoint(0.0F, -1.5F, -4.0F);
        this.Hat2.addBox(-4.0F, -6.0F, 0.0F, 8, 6, 8, 0.0F);
        this.setRotateAngle(Hat2, -0.2617993877991494F, -0.17453292519943295F, 0.0F);
        this.RightArm = new ModelRenderer(this, 66, 41);
        this.RightArm.setRotationPoint(-7.0F, -6.0F, 0.0F);
        this.RightArm.addBox(-4.0F, -2.0F, -2.5F, 5, 18, 5, 0.0F);
        this.setRotateAngle(RightArm, 0.0F, 0.0F, 0.08726646259971647F);
        this.Body = new ModelRenderer(this, 0, 36);
        this.Body.setRotationPoint(0.0F, -8.0F, 0.0F);
        this.Body.addBox(-6.0F, 0.0F, -5.5F, 12, 17, 11, 0.0F);
        this.Nose = new ModelRenderer(this, 0, 22);
        this.Nose.setRotationPoint(0.0F, -2.0F, -4.5F);
        this.Nose.addBox(-1.0F, -0.5F, -1.5F, 2, 4, 2, 0.0F);
        this.Hat3 = new ModelRenderer(this, 68, 0);
        this.Hat3.setRotationPoint(0.0F, -5.0F, 4.0F);
        this.Hat3.addBox(-2.5F, -6.0F, -1.0F, 5, 6, 5, 0.0F);
        this.setRotateAngle(Hat3, -0.8726646259971648F, -0.17453292519943295F, 0.0F);
        this.RightLeg = new ModelRenderer(this, 46, 45);
        this.RightLeg.setRotationPoint(-3.0F, 8.0F, 0.0F);
        this.RightLeg.addBox(-2.5F, 0.0F, -2.5F, 5, 14, 5, 0.0F);
        this.setRotateAngle(RightLeg, 0.0F, 0.08726646259971647F, 0.0F);
        this.LeftLeg = new ModelRenderer(this, 46, 45);
        this.LeftLeg.mirror = true;
        this.LeftLeg.setRotationPoint(3.0F, 8.0F, 0.0F);
        this.LeftLeg.addBox(-2.5F, 0.0F, -2.5F, 5, 14, 5, 0.0F);
        this.setRotateAngle(LeftLeg, 0.0F, -0.08726646259971647F, 0.0F);
        this.Hat1 = new ModelRenderer(this, 0, 5);
        this.Hat1.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.Hat1.addBox(-6.0F, -1.5F, -6.0F, 12, 3, 12, 0.0F);
        this.RightLeg.addChild(this.RightShoe);
        this.LeftLeg.addChild(this.LeftShoe);
        this.Hat3.addChild(this.Hat4);
        this.Hat1.addChild(this.Hat2);
        this.Head.addChild(this.Nose);
        this.Hat2.addChild(this.Hat3);
        this.Head.addChild(this.Hat1);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Head.render(f5);
        this.LeftArm.render(f5);
        this.RightArm.render(f5);
        this.Body.render(f5);
        this.RightLeg.render(f5);
        this.LeftLeg.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
    	float f = 1.0F;
    	
        this.Head.rotateAngleY = netHeadYaw * 0.017453292F;
        this.Head.rotateAngleX = headPitch * 0.017453292F;
        
        this.RightLeg.rotateAngleY = 0.0F;
        this.LeftLeg.rotateAngleY = 0.0F;        
        this.LeftArm.rotateAngleX = 0.0F;
        this.LeftArm.rotateAngleY = 0.0F;
        this.LeftArm.rotateAngleZ = 0.0F;
        this.RightArm.rotateAngleX = 0.0F;
        this.RightArm.rotateAngleY = 0.0F;
        this.RightArm.rotateAngleZ = 0.0F;

        this.RightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 2.0F * limbSwingAmount * 0.5F / f;
        this.LeftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAmount * 0.5F / f;
        this.RightArm.rotateAngleZ += MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
        this.LeftArm.rotateAngleZ -= MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
        this.RightArm.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        this.LeftArm.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        
        this.RightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount * 0.7F;
        this.LeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount * 0.7F;
    }
}
