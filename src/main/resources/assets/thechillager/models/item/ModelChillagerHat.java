package assets.thechillager.models.item;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelChillagerHat - Undefined
 * Created using Tabula 7.0.0
 */
public class ModelChillagerHat extends ModelBase {
    public ModelRenderer Hat1;
    public ModelRenderer Hat2;
    public ModelRenderer Hat3;
    public ModelRenderer Hat4;

    public ModelChillagerHat() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Hat3 = new ModelRenderer(this, 20, 0);
        this.Hat3.setRotationPoint(0.0F, -6.0F, 3.0F);
        this.Hat3.addBox(-2.5F, -6.0F, 0.0F, 5, 6, 5, 0.0F);
        this.setRotateAngle(Hat3, -0.7853981633974483F, 0.0F, 0.0F);
        this.Hat1 = new ModelRenderer(this, 0, 17);
        this.Hat1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hat1.addBox(-6.0F, -9.0F, -6.0F, 12, 3, 12, 0.0F);
        this.Hat4 = new ModelRenderer(this, 0, 23);
        this.Hat4.setRotationPoint(0.0F, -6.5F, 2.5F);
        this.Hat4.addBox(-1.5F, -1.5F, -1.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(Hat4, 0.7853981633974483F, 0.0F, 0.0F);
        this.Hat2 = new ModelRenderer(this, 32, 3);
        this.Hat2.setRotationPoint(0.0F, -9.0F, -4.0F);
        this.Hat2.addBox(-4.0F, -6.0F, 0.0F, 8, 6, 8, 0.0F);
        this.setRotateAngle(Hat2, -0.2617993877991494F, 0.0F, 0.0F);
        this.Hat2.addChild(this.Hat3);
        this.Hat3.addChild(this.Hat4);
        this.Hat1.addChild(this.Hat2);
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
