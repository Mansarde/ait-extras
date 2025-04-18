package com.aitextras.client.models.decor;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

public class SunDialModel extends SinglePartEntityModel {
    private final ModelPart root;
    public SunDialModel(ModelPart root) {
        this.root = root.getChild("root");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData root = modelPartData.addChild("root", ModelPartBuilder.create().uv(24, 27).cuboid(-2.0F, -1.0F, -2.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F))
                .uv(14, 32).cuboid(-1.0F, -3.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(0, 32).cuboid(0.0F, -4.4F, -3.0F, 0.0F, 2.0F, 6.0F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-5.0F, -14.0F, -5.0F, 10.0F, 10.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData cube_r1 = root.addChild("cube_r1", ModelPartBuilder.create().uv(28, 32).cuboid(0.0F, 6.0F, -1.5F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
                .uv(22, 32).cuboid(0.0F, -10.0F, -1.5F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
                .uv(35, 38).cuboid(0.0F, -8.0F, -0.5F, 0.0F, 16.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -9.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

        ModelPartData cube_r2 = root.addChild("cube_r2", ModelPartBuilder.create().uv(2, 48).cuboid(-3.5F, -3.0F, -3.0F, 7.0F, 7.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -9.0F, -0.5F, 0.7854F, 0.0F, 0.0F));
        return TexturedModelData.of(modelData, 64, 64);
    }
    @Override
    public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
        root.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart getPart() {
        return root;
    }
}
