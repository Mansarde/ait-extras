package com.aitextras.client.models.decor;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

public class HatStandModel extends SinglePartEntityModel {
    private final ModelPart root;
    public HatStandModel(ModelPart root) {
        this.root = root.getChild("root");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData root = modelPartData.addChild("root", ModelPartBuilder.create().uv(0, 15).cuboid(-1.0F, -19.5F, -1.0F, 2.0F, 30.0F, 2.0F, new Dilation(0.0F))
                .uv(6, 11).cuboid(-2.5F, -17.0F, -2.5F, 5.0F, 1.0F, 5.0F, new Dilation(0.0F))
                .uv(1, 7).cuboid(-1.5F, 5.7F, -1.5F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-2.5F, -0.1F, -2.5F, 5.0F, 1.0F, 5.0F, new Dilation(0.1F)), ModelTransform.pivot(0.0F, 12.5F, 0.0F));

        ModelPartData cube_r1 = root.addChild("cube_r1", ModelPartBuilder.create().uv(11, 33).mirrored().cuboid(1.1059F, -0.0431F, -0.5F, 0.0F, 6.0F, 1.0F, new Dilation(0.01F)).mirrored(false), ModelTransform.of(-0.001F, 6.9979F, 0.3789F, 1.5708F, -1.1781F, -1.5708F));

        ModelPartData cube_r2 = root.addChild("cube_r2", ModelPartBuilder.create().uv(9, 35).mirrored().cuboid(1.4629F, -6.6774F, -0.5F, 0.0F, 7.0F, 1.0F, new Dilation(0.01F)).mirrored(false), ModelTransform.of(0.0F, 5.9619F, 0.0F, -1.5708F, -1.3963F, 1.5708F));

        ModelPartData cube_r3 = root.addChild("cube_r3", ModelPartBuilder.create().uv(10, 33).cuboid(-1.1059F, -0.0431F, -0.5F, 0.0F, 6.0F, 1.0F, new Dilation(0.01F)), ModelTransform.of(-0.001F, 6.9981F, -0.3799F, -1.5708F, -1.1781F, 1.5708F));

        ModelPartData cube_r4 = root.addChild("cube_r4", ModelPartBuilder.create().uv(8, 35).cuboid(-1.4629F, -6.6774F, -0.5F, 0.0F, 7.0F, 1.0F, new Dilation(0.01F)), ModelTransform.of(0.0F, 5.9619F, 0.0F, 1.5708F, -1.3963F, -1.5708F));

        ModelPartData cube_r5 = root.addChild("cube_r5", ModelPartBuilder.create().uv(11, 33).mirrored().cuboid(0.5F, -2.5F, -0.5F, 0.0F, 6.0F, 1.0F, new Dilation(0.01F)).mirrored(false), ModelTransform.of(1.8789F, 9.036F, -0.001F, 0.0F, 0.0F, -0.3927F));

        ModelPartData cube_r6 = root.addChild("cube_r6", ModelPartBuilder.create().uv(9, 35).mirrored().cuboid(0.5F, -3.5F, -0.5F, 0.0F, 7.0F, 1.0F, new Dilation(0.01F)).mirrored(false), ModelTransform.of(1.5F, 3.0F, 0.0F, 0.0F, 0.0F, 0.1745F));

        ModelPartData cube_r7 = root.addChild("cube_r7", ModelPartBuilder.create().uv(10, 33).cuboid(-0.5F, -2.5F, -0.5F, 0.0F, 6.0F, 1.0F, new Dilation(0.01F)), ModelTransform.of(-1.8799F, 9.0362F, -0.001F, 0.0F, 0.0F, 0.3927F));

        ModelPartData cube_r8 = root.addChild("cube_r8", ModelPartBuilder.create().uv(8, 35).cuboid(-0.5F, -3.5F, -0.5F, 0.0F, 7.0F, 1.0F, new Dilation(0.01F)), ModelTransform.of(-1.5F, 3.0F, 0.0F, 0.0F, 0.0F, -0.1745F));

        ModelPartData cube_r9 = root.addChild("cube_r9", ModelPartBuilder.create().uv(9, 34).cuboid(-1.6341F, 5.6338F, -0.5F, 1.0F, 0.0F, 1.0F, new Dilation(0.01F))
                .uv(9, 34).cuboid(-0.6341F, -0.3662F, -0.5F, 0.0F, 6.0F, 1.0F, new Dilation(0.01F)), ModelTransform.of(0.0F, -16.528F, 0.0F, -0.4636F, -0.6591F, 0.6847F));

        ModelPartData cube_r10 = root.addChild("cube_r10", ModelPartBuilder.create().uv(9, 34).mirrored().cuboid(-1.6341F, 5.6338F, -0.5F, 1.0F, 0.0F, 1.0F, new Dilation(0.01F)).mirrored(false)
                .uv(9, 34).mirrored().cuboid(-0.6341F, -0.3662F, -0.5F, 0.0F, 6.0F, 1.0F, new Dilation(0.01F)).mirrored(false), ModelTransform.of(0.0F, -16.528F, 0.0F, 0.4636F, 0.6591F, 0.6847F));

        ModelPartData cube_r11 = root.addChild("cube_r11", ModelPartBuilder.create().uv(9, 34).cuboid(0.6341F, 5.6338F, -0.5F, 1.0F, 0.0F, 1.0F, new Dilation(0.01F))
                .uv(10, 34).cuboid(0.6341F, -0.3662F, -0.5F, 0.0F, 6.0F, 1.0F, new Dilation(0.01F)), ModelTransform.of(0.0F, -16.528F, 0.0F, 0.4636F, -0.6591F, -0.6847F));

        ModelPartData cube_r12 = root.addChild("cube_r12", ModelPartBuilder.create().uv(9, 34).mirrored().cuboid(0.6341F, 5.6338F, -0.5F, 1.0F, 0.0F, 1.0F, new Dilation(0.01F)).mirrored(false)
                .uv(10, 34).mirrored().cuboid(0.6341F, -0.3662F, -0.5F, 0.0F, 6.0F, 1.0F, new Dilation(0.01F)).mirrored(false), ModelTransform.of(0.0F, -16.528F, 0.0F, -0.4636F, 0.6591F, -0.6847F));

        ModelPartData cube_r13 = root.addChild("cube_r13", ModelPartBuilder.create().uv(18, 17).mirrored().cuboid(-0.75F, -4.25F, -0.5F, 2.0F, 0.0F, 1.0F, new Dilation(0.01F)).mirrored(false), ModelTransform.of(1.8735F, -17.2538F, -1.8735F, 0.7459F, 0.274F, 1.2859F));

        ModelPartData cube_r14 = root.addChild("cube_r14", ModelPartBuilder.create().uv(11, 33).mirrored().cuboid(1.25F, -4.25F, -0.5F, 0.0F, 8.0F, 1.0F, new Dilation(0.01F)).mirrored(false), ModelTransform.of(-1.8735F, -17.2538F, -1.8735F, 2.3957F, 0.274F, 1.8557F));

        ModelPartData cube_r15 = root.addChild("cube_r15", ModelPartBuilder.create().uv(18, 17).cuboid(-1.25F, -4.25F, -0.5F, 2.0F, 0.0F, 1.0F, new Dilation(0.01F)), ModelTransform.of(-1.8735F, -17.2538F, -1.8735F, 0.7459F, -0.274F, -1.2859F));

        ModelPartData cube_r16 = root.addChild("cube_r16", ModelPartBuilder.create().uv(19, 16).cuboid(-0.75F, -4.25F, -0.5F, 2.0F, 0.0F, 1.0F, new Dilation(0.01F))
                .uv(11, 33).cuboid(1.25F, -4.25F, -0.5F, 0.0F, 8.0F, 1.0F, new Dilation(0.01F)), ModelTransform.of(-1.8735F, -17.2538F, 1.8735F, -2.3957F, -0.274F, 1.8557F));

        ModelPartData cube_r17 = root.addChild("cube_r17", ModelPartBuilder.create().uv(18, 17).cuboid(-0.75F, -4.25F, -0.5F, 2.0F, 0.0F, 1.0F, new Dilation(0.01F))
                .uv(11, 33).cuboid(1.25F, -4.25F, -0.5F, 0.0F, 8.0F, 1.0F, new Dilation(0.01F)), ModelTransform.of(1.8735F, -17.2538F, 1.8735F, -0.7459F, -0.274F, 1.2859F));

        ModelPartData cube_r18 = root.addChild("cube_r18", ModelPartBuilder.create().uv(2, 17).cuboid(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.2F)), ModelTransform.of(0.0F, -20.1F, 0.0F, 0.0F, -0.7854F, 0.0F));

        ModelPartData cube_r19 = root.addChild("cube_r19", ModelPartBuilder.create().uv(10, 33).cuboid(-1.25F, -4.25F, -0.5F, 0.0F, 8.0F, 1.0F, new Dilation(0.01F)), ModelTransform.of(1.8735F, -17.2538F, -1.8735F, 2.3957F, -0.274F, -1.8557F));
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