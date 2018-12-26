package assets.thechillager.models.block;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelPresent - Undefined
 * Created using Tabula 7.0.0
 */
public class ModelPresent extends ModelBase {
    public ModelRenderer Box1;
    public ModelRenderer Box2;
    public ModelRenderer Box3;
    public ModelRenderer Box4;
    public ModelRenderer Box5;
    public ModelRenderer Lid;
    public ModelRenderer Ribbon1;
    public ModelRenderer Ribbon2;

    public ModelPresent() {
        this.textureWidth = 64;
        this.textureHeight = 128;
        this.Ribbon2 = new ModelRenderer(this, 24, 12);
        this.Ribbon2.setRotationPoint(0.0F, 15.0F, 0.0F);
        this.Ribbon2.addBox(-4.0F, -4.0F, 0.0F, 8, 4, 1, 0.0F);
        this.setRotateAngle(Ribbon2, 0.0F, -0.7853981633974483F, 0.0F);
        this.Lid = new ModelRenderer(this, 24, 0);
        this.Lid.setRotationPoint(0.0F, 20.0F, 0.0F);
        this.Lid.addBox(-5.0F, -5.0F, -5.0F, 10, 2, 10, 0.25F);
        this.Box4 = new ModelRenderer(this, 0, -1);
        this.Box4.setRotationPoint(0.0F, 20.0F, 0.0F);
        this.Box4.addBox(5.0F, -4.0F, -5.0F, 0, 8, 10, 0.0F);
        this.Box5 = new ModelRenderer(this, 34, 0);
        this.Box5.setRotationPoint(0.0F, 20.0F, 0.0F);
        this.Box5.addBox(-5.0F, 4.0F, -5.0F, 10, 0, 10, 0.0F);
        this.Box1 = new ModelRenderer(this, 0, -10);
        this.Box1.setRotationPoint(0.0F, 20.0F, 0.0F);
        this.Box1.addBox(-5.0F, -4.0F, -5.0F, 0, 8, 10, 0.0F);
        this.Ribbon1 = new ModelRenderer(this, 24, 12);
        this.Ribbon1.setRotationPoint(0.0F, 15.0F, 0.0F);
        this.Ribbon1.addBox(-4.0F, -4.0F, 0.0F, 8, 4, 1, 0.0F);
        this.setRotateAngle(Ribbon1, 0.0F, 0.7853981633974483F, 0.0F);
        this.Box2 = new ModelRenderer(this, 0, -2);
        this.Box2.setRotationPoint(0.0F, 20.0F, 0.0F);
        this.Box2.addBox(-5.0F, -4.0F, -5.0F, 0, 8, 10, 0.0F);
        this.setRotateAngle(Box2, 0.0F, -1.5707963267948966F, 0.0F);
        this.Box3 = new ModelRenderer(this, 0, 6);
        this.Box3.setRotationPoint(0.0F, 20.0F, 0.0F);
        this.Box3.addBox(-5.0F, -4.0F, -5.0F, 0, 8, 10, 0.0F);
        this.setRotateAngle(Box3, 0.0F, 1.5707963267948966F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Ribbon2.render(f5);
        this.Lid.render(f5);
        this.Box4.render(f5);
        this.Box5.render(f5);
        this.Box1.render(f5);
        this.Ribbon1.render(f5);
        this.Box2.render(f5);
        this.Box3.render(f5);
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
