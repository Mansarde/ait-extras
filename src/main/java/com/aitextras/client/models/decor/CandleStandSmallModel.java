package com.aitextras.client.models.decor;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

public class CandleStandSmallModel extends SinglePartEntityModel {
    private final ModelPart root;
    public CandleStandSmallModel(ModelPart root) {
        this.root = root.getChild("root");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData root = modelPartData.addChild("root", ModelPartBuilder.create().uv(10, 24).cuboid(-2.0F, -3.0F, -2.0F, 4.0F, 5.0F, 0.0F, new Dilation(0.0F))
                .uv(8, 13).cuboid(-1.0F, -8.0F, -0.9F, 2.0F, 5.0F, 2.0F, new Dilation(0.0F))
                .uv(0, 7).cuboid(-2.0F, -3.0F, -1.9F, 4.0F, 2.0F, 4.0F, new Dilation(0.0F))
                .uv(24, 0).mirrored().cuboid(0.0F, -2.0F, 0.1F, 4.0F, 3.0F, 0.0F, new Dilation(0.0F)).mirrored(false)
                .uv(24, 0).cuboid(8.0F, -2.0F, 0.1F, 4.0F, 3.0F, 0.0F, new Dilation(0.0F))
                .uv(8, 13).cuboid(11.0F, -8.0F, -0.9F, 2.0F, 5.0F, 2.0F, new Dilation(0.0F))
                .uv(10, 24).cuboid(10.0F, -3.0F, 2.2F, 4.0F, 5.0F, 0.0F, new Dilation(0.0F))
                .uv(0, 0).cuboid(3.0F, 16.0F, -2.9F, 6.0F, 1.0F, 6.0F, new Dilation(0.0F))
                .uv(16, 12).cuboid(5.0F, 11.0F, -0.9F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(16, 7).cuboid(5.0F, 13.0F, -0.9F, 2.0F, 3.0F, 2.0F, new Dilation(0.3F))
                .uv(0, 13).cuboid(5.0F, 0.0F, 0.1F, 2.0F, 11.0F, 0.0F, new Dilation(0.0F))
                .uv(16, 16).cuboid(4.0F, -3.0F, -1.9F, 4.0F, 2.0F, 4.0F, new Dilation(0.0F))
                .uv(8, 13).cuboid(5.0F, -8.0F, -0.9F, 2.0F, 5.0F, 2.0F, new Dilation(0.0F))
                .uv(20, 22).cuboid(5.0F, -2.0F, -0.9F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(16, 16).cuboid(5.5F, -9.0F, 0.1F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
                .uv(16, 16).cuboid(-0.5F, -9.0F, 0.1F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
                .uv(16, 16).cuboid(11.5F, -9.0F, 0.1F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(-6.0F, 7.0F, -0.1F));

        ModelPartData cube_r1 = root.addChild("cube_r1", ModelPartBuilder.create().uv(16, 16).cuboid(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(12.0F, -8.5F, 0.1F, 0.0F, -1.5708F, 0.0F));

        ModelPartData cube_r2 = root.addChild("cube_r2", ModelPartBuilder.create().uv(16, 16).cuboid(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -8.5F, 0.1F, 0.0F, -1.5708F, 0.0F));

        ModelPartData cube_r3 = root.addChild("cube_r3", ModelPartBuilder.create().uv(16, 16).cuboid(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, -8.5F, 0.1F, 0.0F, -1.5708F, 0.0F));

        ModelPartData cube_r4 = root.addChild("cube_r4", ModelPartBuilder.create().uv(0, 13).cuboid(-1.0F, -2.5F, 0.0F, 2.0F, 11.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, 2.5F, 0.1F, 0.0F, 1.5708F, 0.0F));

        ModelPartData cube_r5 = root.addChild("cube_r5", ModelPartBuilder.create().uv(0, 7).cuboid(-2.0F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(12.0F, -2.0F, 0.1F, 0.0F, 3.1416F, 0.0F));
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
