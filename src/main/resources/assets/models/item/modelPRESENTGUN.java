package egg;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * modelPRESENTGUN - Undefined
 * Created using Tabula 7.0.0
 */
public class modelPRESENTGUN extends ModelBase {
    public ModelRenderer GunHandle;
    public ModelRenderer BackThingy1;
    public ModelRenderer MiddleThing1;
    public ModelRenderer MiddleThing2;
    public ModelRenderer MiddleThing3;
    public ModelRenderer BackThingy2;
    public ModelRenderer ShootyThing;
    public ModelRenderer Bow1;
    public ModelRenderer Bow2;
    public ModelRenderer AimingThingy;

    public modelPRESENTGUN() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.ShootyThing = new ModelRenderer(this, 22, 24);
        this.ShootyThing.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ShootyThing.addBox(-2.5F, -2.5F, -3.0F, 5, 5, 3, 0.0F);
        this.MiddleThing2 = new ModelRenderer(this, 0, 24);
        this.MiddleThing2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.MiddleThing2.addBox(-2.0F, -2.0F, 4.0F, 4, 4, 4, 0.0F);
        this.AimingThingy = new ModelRenderer(this, 16, 28);
        this.AimingThingy.setRotationPoint(2.0F, 0.0F, 5.0F);
        this.AimingThingy.addBox(-1.0F, -3.0F, 0.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(AimingThingy, -0.2617993877991494F, 0.0F, 1.5707963267948966F);
        this.Bow2 = new ModelRenderer(this, 0, 0);
        this.Bow2.setRotationPoint(0.0F, -2.5F, -1.0F);
        this.Bow2.addBox(-1.5F, -3.0F, 0.0F, 3, 3, 1, 0.0F);
        this.setRotateAngle(Bow2, 0.0F, 0.7853981633974483F, 0.0F);
        this.Bow1 = new ModelRenderer(this, 0, 0);
        this.Bow1.setRotationPoint(0.0F, -2.5F, -1.0F);
        this.Bow1.addBox(-1.5F, -3.0F, 0.0F, 3, 3, 1, 0.0F);
        this.setRotateAngle(Bow1, 0.0F, -0.7853981633974483F, 0.0F);
        this.MiddleThing3 = new ModelRenderer(this, 0, 24);
        this.MiddleThing3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.MiddleThing3.addBox(-2.0F, -2.0F, 8.0F, 4, 4, 4, 0.0F);
        this.GunHandle = new ModelRenderer(this, 0, 14);
        this.GunHandle.setRotationPoint(0.0F, 1.0F, 3.0F);
        this.GunHandle.addBox(-1.0F, 0.0F, 0.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(GunHandle, 0.4363323129985824F, 0.0F, 0.0F);
        this.MiddleThing1 = new ModelRenderer(this, 0, 24);
        this.MiddleThing1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.MiddleThing1.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 4, 0.0F);
        this.BackThingy1 = new ModelRenderer(this, 0, 6);
        this.BackThingy1.setRotationPoint(0.0F, 0.0F, 12.0F);
        this.BackThingy1.addBox(-1.0F, -2.0F, 0.0F, 2, 3, 5, 0.0F);
        this.BackThingy2 = new ModelRenderer(this, 38, 23);
        this.BackThingy2.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.BackThingy2.addBox(-1.5F, -2.0F, 0.0F, 3, 4, 5, 0.0F);
        this.MiddleThing1.addChild(this.ShootyThing);
        this.MiddleThing2.addChild(this.AimingThingy);
        this.ShootyThing.addChild(this.Bow2);
        this.ShootyThing.addChild(this.Bow1);
        this.BackThingy1.addChild(this.BackThingy2);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.MiddleThing2.render(f5);
        this.MiddleThing3.render(f5);
        this.GunHandle.render(f5);
        this.MiddleThing1.render(f5);
        this.BackThingy1.render(f5);
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
