package com.aitextras.client.models.decor.hudolinsupport;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

public class HudolinSupportBaseModel extends SinglePartEntityModel {
    private final ModelPart root;
    public HudolinSupportBaseModel(ModelPart root) {
        this.root = root.getChild("root");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData root = modelPartData.addChild("root", ModelPartBuilder.create().uv(38, 30).cuboid(-4.5F, 28.2538F, -4.479F, 9.0F, 9.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.2538F, 4.479F, 0.0F, 3.1416F, 0.0F));

        ModelPartData cube_r1 = root.addChild("cube_r1", ModelPartBuilder.create().uv(38, 55).cuboid(-8.0F, -4.0F, -4.0F, 16.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 33.2538F, 11.521F, 0.3054F, 0.0F, 0.0F));
        return TexturedModelData.of(modelData, 128, 128);
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
