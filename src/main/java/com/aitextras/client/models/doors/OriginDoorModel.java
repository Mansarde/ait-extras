//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.aitextras.client.models.doors;

import dev.amble.ait.AITMod;
import dev.amble.ait.client.AITModClient;
import dev.amble.ait.client.models.doors.DoorModel;
import dev.amble.ait.client.models.exteriors.BoothExteriorModel;
import dev.amble.ait.client.tardis.ClientTardis;
import dev.amble.ait.core.tardis.handler.DoorHandler;
import net.minecraft.client.model.*;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.animation.Animation.Builder;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.RotationAxis;

public class OriginDoorModel extends DoorModel {
    private final ModelPart bone;

    public OriginDoorModel(ModelPart root) {
        super(RenderLayer::getEntityCutoutNoCull);
        this.bone = root.getChild("bone");
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 2.0F));

        ModelPartData body = bone.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -19.1F, 0.0F));

        ModelPartData top = body.addChild("top", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 21.0F, 0.0F));

        ModelPartData octagon_r1 = top.addChild("octagon_r1", ModelPartBuilder.create().uv(18, 87).mirrored().cuboid(-4.9706F, -4.0F, -1.0F, 6.0F, 8.0F, 9.0F, new Dilation(0.001F)).mirrored(false), ModelTransform.of(6.0F, -38.0F, -3.0F, 0.0F, -3.1416F, 0.0F));

        ModelPartData octagon_r2 = top.addChild("octagon_r2", ModelPartBuilder.create().uv(18, 87).cuboid(-1.0294F, -4.0F, -1.0F, 6.0F, 8.0F, 9.0F, new Dilation(0.001F)), ModelTransform.of(-6.0F, -38.0F, -3.0F, 0.0F, 3.1416F, 0.0F));

        ModelPartData octagon_r3 = top.addChild("octagon_r3", ModelPartBuilder.create().uv(15, 87).cuboid(-4.9706F, -4.0F, -1.0F, 9.9411F, 8.0F, 9.0F, new Dilation(0.001F)), ModelTransform.of(0.0F, -38.0F, -3.0F, 0.0F, 3.1416F, 0.0F));

        ModelPartData middle = body.addChild("middle", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 21.0F, 0.0F));

        ModelPartData octagon_r4 = middle.addChild("octagon_r4", ModelPartBuilder.create().uv(34, 153).cuboid(-2.0F, -16.0F, 0.0F, 4.0F, 32.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-9.3787F, -18.0F, -5.4706F, 0.0F, 0.7854F, 0.0F));

        ModelPartData octagon_r5 = middle.addChild("octagon_r5", ModelPartBuilder.create().uv(22, 153).cuboid(-2.0F, -16.0F, 0.0F, 4.0F, 32.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(9.3787F, -18.0F, -5.4706F, 0.0F, -0.7854F, 0.0F));

        ModelPartData bottom = body.addChild("bottom", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 21.0F, 0.0F));

        ModelPartData Door = bone.addChild("Door", ModelPartBuilder.create().uv(0, 153).cuboid(-4.7635F, -11.0F, -10.1F, 9.5269F, 32.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -21.1F, 0.1F, 0.0F, 0.0436F, 0.0F));

        ModelPartData octagon_r6 = Door.addChild("octagon_r6", ModelPartBuilder.create().uv(46, 153).cuboid(-2.5F, -16.0F, -0.5F, 5.0F, 32.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-6.1777F, 5.0F, -7.9645F, 0.0F, 0.7854F, 0.0F));

        ModelPartData octagon_r7 = Door.addChild("octagon_r7", ModelPartBuilder.create().uv(154, 129).cuboid(-2.5F, -16.0F, -0.5F, 5.0F, 32.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(6.1777F, 5.0F, -7.9645F, 0.0F, -0.7854F, 0.0F));
        return TexturedModelData.of(modelData, 256, 256);
    }

    public ModelPart getPart() {
        return this.bone;
    }

    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
        BoothExteriorModel boothExteriorModel = new BoothExteriorModel(BoothExteriorModel.getTexturedModelData().createModel());
        ModelPart part = boothExteriorModel.getPart();
        part.getChild("Door").visible = false;
        part.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
    }

    public Animation getAnimationForDoorState(DoorHandler.AnimationDoorState state) {
        return Builder.create(0.0F).build();
    }

    @Override
    public void renderWithAnimations(ClientTardis tardis, dev.amble.ait.api.tardis.link.v2.block.AbstractLinkableBlockEntity linkableBlockEntity, ModelPart root, MatrixStack matrices,
                                     VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float pAlpha) {
        matrices.push();
        if (!AITModClient.CONFIG.animateDoors) {
            this.bone.getChild("Door").yaw = linkableBlockEntity.tardis().get().door().isOpen() ? 1.575F : 0.0F;
        } else {
            float maxRot = 90.0F;
            this.bone.getChild("Door").yaw = (float)Math.toRadians((double)(maxRot * linkableBlockEntity.tardis().get().door().getLeftRot()));
        }

        matrices.scale(1.0F, 1.0F, 1.0F);
        matrices.translate(0.0F, -1.5F, 0.0F);
        matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180.0F));
        super.renderWithAnimations(tardis, linkableBlockEntity, root, matrices, vertices, light, overlay, red, green, blue, pAlpha);
        matrices.pop();
    }
}