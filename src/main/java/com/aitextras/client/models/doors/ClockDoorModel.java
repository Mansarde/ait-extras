//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.aitextras.client.models.doors;

import dev.amble.ait.AITMod;
import dev.amble.ait.api.tardis.link.v2.block.AbstractLinkableBlockEntity;
import dev.amble.ait.client.AITModClient;
import dev.amble.ait.client.models.doors.DoorModel;
import dev.amble.ait.client.models.exteriors.BoothExteriorModel;
import dev.amble.ait.client.tardis.ClientTardis;
import dev.amble.ait.core.tardis.handler.DoorHandler;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.animation.Animation.Builder;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.RotationAxis;

public class ClockDoorModel extends DoorModel {
    private final ModelPart bone;

    public ClockDoorModel(ModelPart root) {
        this.bone = root.getChild("bone");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create().uv(12, 31).cuboid(-9.0F, -4.0F, -7.0F, 18.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(11, 70).cuboid(-8.0F, -10.0F, -6.0F, 16.0F, 6.0F, 1.0F, new Dilation(0.0F))
                .uv(80, 95).cuboid(-8.0F, -50.0F, -7.0F, 1.0F, 39.0F, 1.0F, new Dilation(0.0F))
                .uv(84, 95).cuboid(7.0F, -50.0F, -7.0F, 1.0F, 39.0F, 1.0F, new Dilation(0.0F))
                .uv(137, 94).cuboid(7.0F, -50.0F, -7.0F, 1.0F, 39.0F, 1.0F, new Dilation(0.2F))
                .uv(137, 94).cuboid(-8.0F, -50.0F, -7.0F, 1.0F, 39.0F, 1.0F, new Dilation(0.2F))
                .uv(56, 123).cuboid(-9.0F, -52.0F, -7.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(56, 123).cuboid(6.0F, -52.0F, -7.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(12, 12).cuboid(-9.0F, -56.0F, -7.0F, 18.0F, 4.0F, 2.0F, new Dilation(0.0F))
                .uv(76, 12).cuboid(-7.0F, -58.0F, -7.0F, 14.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(0, 115).cuboid(-9.0F, -58.0F, -7.2F, 18.0F, 7.0F, 0.0F, new Dilation(0.0F))
                .uv(0, 115).cuboid(-9.0F, -58.0F, -4.8F, 18.0F, 7.0F, 0.0F, new Dilation(0.0F))
                .uv(120, 7).cuboid(-5.0F, -10.0F, -6.2F, 10.0F, 6.0F, 0.0F, new Dilation(0.0F))
                .uv(11, 15).cuboid(-9.0F, -11.0F, -7.0F, 18.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(10, 24).cuboid(-9.0F, -40.0F, -7.0F, 18.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(56, 107).cuboid(-9.0F, -2.0F, -7.0F, 4.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(56, 107).cuboid(5.0F, -2.0F, -7.0F, 4.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData cube_r1 = bone.addChild("cube_r1", ModelPartBuilder.create().uv(148, 39).cuboid(-4.85F, -5.55F, -0.3F, 10.0F, 11.0F, 0.0F, new Dilation(0.0F))
                .uv(11, 46).cuboid(-8.15F, -5.95F, -0.2F, 16.0F, 12.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.15F, -46.05F, -5.8F, 0.0F, 3.1416F, 0.0F));

        ModelPartData door = bone.addChild("door", ModelPartBuilder.create().uv(92, 94).cuboid(0.0F, -28.0F, -0.1F, 14.0F, 28.0F, 0.0F, new Dilation(0.0F))
                .uv(130, 78).cuboid(12.7F, -15.1F, -0.6F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(92, 65).cuboid(0.0F, -28.0F, 0.0F, 14.0F, 28.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-7.0F, -11.0F, -6.0F));
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
    public void renderWithAnimations(ClientTardis tardis, AbstractLinkableBlockEntity linkableBlockEntity, ModelPart root, MatrixStack matrices,
                                     VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float pAlpha) {
        matrices.push();
        if (!AITModClient.CONFIG.animateDoors) {
            this.bone.getChild("door").yaw = linkableBlockEntity.tardis().get().door().isOpen() ? 1.575F : 0.0F;
        } else {
            float maxRot = 90.0F;
            this.bone.getChild("door").yaw = (float)Math.toRadians((double)(maxRot * linkableBlockEntity.tardis().get().door().getLeftRot()));
        }

        matrices.scale(1.0F, 1.0F, 1.0F);
        matrices.translate(0.0F, -1.5F, 0.0F);
        matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180.0F));
        super.renderWithAnimations(tardis, linkableBlockEntity, root, matrices, vertices, light, overlay, red, green, blue, pAlpha);
        matrices.pop();
    }
}
