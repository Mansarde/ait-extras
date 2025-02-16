package com.aitextras.client.models.monitors;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.RotationAxis;

public class VictorianMonitorModel extends SinglePartEntityModel {
    private final ModelPart victorian;

    public VictorianMonitorModel(ModelPart root) {
        this.victorian = root.getChild("victorian");
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData victorian = modelPartData.addChild("victorian", ModelPartBuilder.create().uv(0, 34).cuboid(-1.5F, -15.0F, -1.0F, 3.0F, 19.0F, 0.0F, new Dilation(0.0F))
                .uv(2, 2).cuboid(-5.0F, -13.0F, -3.0F, 10.0F, 13.0F, 4.0F, new Dilation(0.0F))
                .uv(22, 20).cuboid(-3.0F, -11.0F, -4.2F, 6.0F, 5.0F, 0.0F, new Dilation(0.0F))
                .uv(19, 28).cuboid(-2.5F, -4.5F, -4.2F, 5.0F, 3.0F, 0.0F, new Dilation(0.0F))
                .uv(32, 0).cuboid(-4.0F, -12.0F, -4.0F, 8.0F, 11.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 21.0F, 1.0F));

        ModelPartData cube_r1 = victorian.addChild("cube_r1", ModelPartBuilder.create().uv(0, 34).cuboid(-1.5F, -9.0F, 0.0F, 3.0F, 19.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, -1.0F, 0.0F, -1.5708F, 0.0F));
        return TexturedModelData.of(modelData, 64, 64);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red,
                       float green, float blue, float alpha) {
        matrices.push();
        matrices.multiply(RotationAxis.NEGATIVE_Y.rotationDegrees(180));

        victorian.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);

        matrices.pop();
    }

    @Override
    public ModelPart getPart() {
        return victorian;
    }

    @Override
    public void setAngles(Entity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw,
                          float headPitch) {
    }
}
