package com.aitextras.client.models.decor;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

public class CandleStandLargeModel extends SinglePartEntityModel {
    private final ModelPart root;
    public CandleStandLargeModel(ModelPart root) {
        this.root = root.getChild("root");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData root = modelPartData.addChild("root", ModelPartBuilder.create().uv(9, 15).cuboid(0.0F, -5.0F, 0.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
                .uv(16, 16).cuboid(0.0F, -6.0F, 0.5F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
                .uv(9, 15).cuboid(3.0F, -5.0F, 0.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
                .uv(16, 16).cuboid(3.0F, -6.0F, 0.5F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
                .uv(9, 15).cuboid(12.0F, -5.0F, 0.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
                .uv(16, 16).cuboid(12.0F, -6.0F, 0.5F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
                .uv(9, 15).cuboid(15.0F, -5.0F, 0.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
                .uv(16, 16).cuboid(15.0F, -6.0F, 0.5F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
                .uv(20, 23).cuboid(-0.5F, -1.0F, -0.5F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(18, 28).mirrored().cuboid(0.1F, -0.8F, 0.5F, 7.0F, 4.0F, 0.0F, new Dilation(0.0F)).mirrored(false)
                .uv(20, 23).cuboid(2.5F, -1.0F, -0.5F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(20, 23).cuboid(11.5F, -1.0F, -0.5F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(18, 28).cuboid(9.1F, -0.8F, 0.5F, 7.0F, 4.0F, 0.0F, new Dilation(0.0F))
                .uv(20, 23).cuboid(14.5F, -1.0F, -0.5F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(0, 0).cuboid(5.1F, 18.2F, -2.5F, 6.0F, 1.0F, 6.0F, new Dilation(0.0F))
                .uv(16, 12).cuboid(7.1F, 13.2F, -0.5F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(16, 7).cuboid(7.1F, 15.2F, -0.5F, 2.0F, 3.0F, 2.0F, new Dilation(0.3F))
                .uv(0, 13).cuboid(7.1F, 2.2F, 0.5F, 2.0F, 11.0F, 0.0F, new Dilation(0.0F))
                .uv(0, 7).cuboid(6.1F, -0.8F, -1.5F, 4.0F, 2.0F, 4.0F, new Dilation(0.0F))
                .uv(8, 13).cuboid(7.1F, -5.8F, -0.5F, 2.0F, 5.0F, 2.0F, new Dilation(0.0F))
                .uv(16, 16).cuboid(7.6F, -6.8F, 0.5F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
                .uv(20, 22).cuboid(7.1F, 0.2F, -0.5F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(10, 24).cuboid(6.1F, -0.8F, -1.6F, 4.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(-8.1F, 4.8F, -0.5F));

        ModelPartData cube_r1 = root.addChild("cube_r1", ModelPartBuilder.create().uv(16, 16).cuboid(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(8.1F, -6.3F, 0.5F, 0.0F, -1.5708F, 0.0F));

        ModelPartData cube_r2 = root.addChild("cube_r2", ModelPartBuilder.create().uv(0, 13).cuboid(-1.0F, -2.5F, 0.0F, 2.0F, 11.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(8.1F, 4.7F, 0.5F, 0.0F, 1.5708F, 0.0F));

        ModelPartData cube_r3 = root.addChild("cube_r3", ModelPartBuilder.create().uv(16, 16).cuboid(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(15.5F, -5.5F, 0.5F, 0.0F, -1.5272F, 0.0F));

        ModelPartData cube_r4 = root.addChild("cube_r4", ModelPartBuilder.create().uv(16, 16).cuboid(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(12.5F, -5.5F, 0.5F, 0.0F, -1.5272F, 0.0F));

        ModelPartData cube_r5 = root.addChild("cube_r5", ModelPartBuilder.create().uv(16, 16).cuboid(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(3.5F, -5.5F, 0.5F, 0.0F, -1.5272F, 0.0F));

        ModelPartData cube_r6 = root.addChild("cube_r6", ModelPartBuilder.create().uv(16, 16).cuboid(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, -5.5F, 0.5F, 0.0F, -1.5272F, 0.0F));
        return TexturedModelData.of(modelData, 32, 32);
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
