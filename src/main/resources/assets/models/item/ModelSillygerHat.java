package egg;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelSillygerHat - Undefined
 * Created using Tabula 7.0.0
 */
public class ModelSillygerHat extends ModelBase {
    public ModelRenderer Hat1;
    public ModelRenderer Hat2;
    public ModelRenderer Spikes;
    public ModelRenderer Puff1;
    public ModelRenderer Puff2;

    public ModelSillygerHat() {
        this.textureWidth = 32;
        this.textureHeight = 32;
        this.Hat2 = new ModelRenderer(this, 0, 9);
        this.Hat2.setRotationPoint(0.0F, -11.0F, -2.0F);
        this.Hat2.addBox(-2.0F, -3.0F, 0.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(Hat2, -0.17453292519943295F, 0.0F, 0.0F);
        this.Hat1 = new ModelRenderer(this, 0, 0);
        this.Hat1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hat1.addBox(-3.0F, -11.01F, -3.0F, 6, 3, 6, 0.0F);
        this.Puff2 = new ModelRenderer(this, 0, 0);
        this.Puff2.setRotationPoint(0.0F, -3.0F, 2.0F);
        this.Puff2.addBox(-1.0F, -2.0F, 0.0F, 2, 2, 0, 0.0F);
        this.setRotateAngle(Puff2, 0.0F, 0.7853981633974483F, 0.0F);
        this.Puff1 = new ModelRenderer(this, 0, 0);
        this.Puff1.setRotationPoint(0.0F, -3.0F, 2.0F);
        this.Puff1.addBox(-1.0F, -2.0F, 0.0F, 2, 2, 0, 0.0F);
        this.setRotateAngle(Puff1, 0.0F, -0.7853981633974483F, 0.0F);
        this.Spikes = new ModelRenderer(this, 0, 16);
        this.Spikes.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Spikes.addBox(-4.0F, -10.01F, -4.0F, 8, 2, 8, 0.0F);
        this.Hat1.addChild(this.Hat2);
        this.Hat2.addChild(this.Puff2);
        this.Hat2.addChild(this.Puff1);
        this.Hat1.addChild(this.Spikes);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Hat1.render(f5);
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
