package egg;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelSillyger - Undefined
 * Created using Tabula 7.0.0
 */
public class ModelSillyger extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body;
    public ModelRenderer RightLeg;
    public ModelRenderer LeftLeg;
    public ModelRenderer RightArm;
    public ModelRenderer LeftArm;
    public ModelRenderer Ears;
    public ModelRenderer Nose;
    public ModelRenderer Hat1;
    public ModelRenderer Hat2;
    public ModelRenderer Hat3;
    public ModelRenderer Hat4;

    public ModelSillyger() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.Head.addBox(-3.0F, -8.0F, -3.0F, 6, 8, 6, 0.0F);
        this.Hat2 = new ModelRenderer(this, 0, 24);
        this.Hat2.setRotationPoint(0.0F, -8.0F, -2.0F);
        this.Hat2.addBox(-2.0F, -3.0F, 0.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(Hat2, -0.17453292519943295F, 0.0F, 0.0F);
        this.Hat1 = new ModelRenderer(this, 0, 14);
        this.Hat1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hat1.addBox(-4.0F, -7.0F, -4.0F, 8, 2, 8, 0.0F);
        this.Hat3 = new ModelRenderer(this, 0, 20);
        this.Hat3.setRotationPoint(0.0F, -3.0F, 2.0F);
        this.Hat3.addBox(-1.0F, -2.0F, 0.0F, 2, 2, 0, 0.0F);
        this.setRotateAngle(Hat3, 0.0F, -0.7853981633974483F, 0.0F);
        this.Body = new ModelRenderer(this, 16, 25);
        this.Body.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.Body.addBox(-2.0F, 0.0F, -1.5F, 4, 4, 3, 0.0F);
        this.RightArm = new ModelRenderer(this, 38, 26);
        this.RightArm.setRotationPoint(-2.0F, 17.0F, 0.0F);
        this.RightArm.addBox(-2.0F, -1.0F, -1.0F, 2, 4, 2, 0.0F);
        this.Nose = new ModelRenderer(this, 18, 0);
        this.Nose.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Nose.addBox(-1.0F, -3.0F, -5.0F, 2, 4, 2, 0.0F);
        this.Hat4 = new ModelRenderer(this, 0, 20);
        this.Hat4.setRotationPoint(0.0F, -3.0F, 2.0F);
        this.Hat4.addBox(-1.0F, -2.0F, 0.0F, 2, 2, 0, 0.0F);
        this.setRotateAngle(Hat4, 0.0F, 0.7853981633974483F, 0.0F);
        this.LeftLeg = new ModelRenderer(this, 30, 26);
        this.LeftLeg.mirror = true;
        this.LeftLeg.setRotationPoint(0.9F, 20.0F, 0.0F);
        this.LeftLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.LeftArm = new ModelRenderer(this, 38, 26);
        this.LeftArm.mirror = true;
        this.LeftArm.setRotationPoint(2.0F, 17.0F, 0.0F);
        this.LeftArm.addBox(0.0F, -1.0F, -1.0F, 2, 4, 2, 0.0F);
        this.RightLeg = new ModelRenderer(this, 30, 26);
        this.RightLeg.setRotationPoint(-0.9F, 20.0F, 0.0F);
        this.RightLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.Ears = new ModelRenderer(this, 38, 0);
        this.Ears.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Ears.addBox(-6.0F, -4.0F, 1.0F, 12, 3, 1, 0.0F);
        this.Head.addChild(this.Hat2);
        this.Head.addChild(this.Hat1);
        this.Hat2.addChild(this.Hat3);
        this.Head.addChild(this.Nose);
        this.Hat2.addChild(this.Hat4);
        this.Head.addChild(this.Ears);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Head.render(f5);
        this.Body.render(f5);
        this.RightArm.render(f5);
        this.LeftLeg.render(f5);
        this.LeftArm.render(f5);
        this.RightLeg.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
