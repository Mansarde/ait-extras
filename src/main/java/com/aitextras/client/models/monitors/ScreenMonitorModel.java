package com.aitextras.client.models.monitors;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.RotationAxis;

public class ScreenMonitorModel extends SinglePartEntityModel {
    private final ModelPart screen;

    public ScreenMonitorModel(ModelPart root) {
        this.screen = root.getChild("screen");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData screen = modelPartData.addChild("screen", ModelPartBuilder.create().uv(0, 0).cuboid(-8.0F, -32.0F, -8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
                .uv(0, 0).cuboid(8.0F, -32.0F, -8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-24.0F, -32.0F, -8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
                .uv(0, 0).cuboid(8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-24.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));
        return TexturedModelData.of(modelData, 64, 64);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red,
                       float green, float blue, float alpha) {
        matrices.push();
        matrices.multiply(RotationAxis.NEGATIVE_Y.rotationDegrees(180));

        screen.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);

        matrices.pop();
    }

    @Override
    public ModelPart getPart() {
        return screen;
    }

    @Override
    public void setAngles(Entity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw,
                          float headPitch) {
    }
}
