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
        ModelPartData root = modelPartData.addChild("root", ModelPartBuilder.create().uv(0, 0).cuboid(0.0F, -20.25F, -8.0F, 0.0F, 16.0F, 16.0F, new Dilation(0.0F))
                .uv(21, 32).cuboid(0.0F, -4.4F, -3.0F, 0.0F, 2.0F, 6.0F, new Dilation(0.0F))
                .uv(35, 32).cuboid(-1.0F, -3.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(45, 27).cuboid(-2.0F, -1.0F, -2.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData cube_r1 = root.addChild("cube_r1", ModelPartBuilder.create().uv(0, 0).cuboid(0.0F, -8.0F, -8.0F, 0.0F, 16.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -12.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

        ModelPartData cube_r2 = root.addChild("cube_r2", ModelPartBuilder.create().uv(0, 0).cuboid(0.0F, -8.0F, -8.0F, 0.0F, 16.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -12.0F, 0.0F, 1.5708F, 0.7854F, 1.5708F));

        ModelPartData cube_r3 = root.addChild("cube_r3", ModelPartBuilder.create().uv(0, 0).cuboid(0.0F, -8.0F, -8.0F, 0.0F, 16.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -12.0F, 0.0F, -1.5708F, 0.7854F, -1.5708F));

        ModelPartData arrow = root.addChild("arrow", ModelPartBuilder.create(), ModelTransform.of(-0.1738F, -10.624F, 1.2509F, -0.829F, 0.0F, 0.0F));

        ModelPartData cube_r4 = arrow.addChild("cube_r4", ModelPartBuilder.create().uv(0, 32).cuboid(3.0F, -2.5F, -2.5F, 0.0F, 5.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-0.0262F, 0.0109F, 4.6667F, 0.0F, -1.5708F, -0.7418F));

        ModelPartData cube_r5 = arrow.addChild("cube_r5", ModelPartBuilder.create().uv(0, 25).mirrored().cuboid(-0.7F, -2.1F, -12.0F, 0.0F, 5.0F, 22.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(0.8274F, 0.1573F, -1.3333F, 0.0F, 0.0F, 0.7418F));

        ModelPartData cube_r6 = arrow.addChild("cube_r6", ModelPartBuilder.create().uv(0, 25).cuboid(0.0F, -2.7F, -12.0F, 0.0F, 5.0F, 22.0F, new Dilation(0.0F)), ModelTransform.of(0.1203F, 0.1573F, -1.3333F, 0.0F, 0.0F, -0.7418F));
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
