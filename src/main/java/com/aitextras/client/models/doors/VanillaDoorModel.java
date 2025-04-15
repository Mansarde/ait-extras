//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.aitextras.client.models.doors;

import dev.amble.ait.AITMod;
import dev.amble.ait.api.tardis.link.v2.block.AbstractLinkableBlockEntity;
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

public class VanillaDoorModel extends DoorModel {
    private final ModelPart BONE;

    public VanillaDoorModel(ModelPart root) {
        super(RenderLayer::getEntityCutoutNoCull);
        this.BONE = root.getChild("bone");
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create(), ModelTransform.pivot(14.0F, 24.0F, -6.0F));

        ModelPartData door = bone.addChild("door", ModelPartBuilder.create().uv(0, 64).cuboid(0.0F, -23.75F, -2.0F, 16.0F, 32.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(-22.0F, -8.25F, -1.0F));
        return TexturedModelData.of(modelData, 128, 128);
    }

    public ModelPart getPart() {
        return this.BONE;
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
        if (!AITMod.CONFIG.CLIENT.ANIMATE_DOORS) {
            this.BONE.getChild("door").yaw = linkableBlockEntity.tardis().get().door().isOpen() ? 1.575F : 0.0F;
        } else {
            float maxRot = -90.0F;
            this.BONE.getChild("door").yaw = (float)Math.toRadians((double)(maxRot * linkableBlockEntity.tardis().get().door().getLeftRot()));
        }

        matrices.scale(1.0F, 1.0F, 1.0F);
        matrices.translate(0.0F, -1.5F, 0.0F);
        matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180.0F));
        super.renderWithAnimations(tardis, linkableBlockEntity, root, matrices, vertices, light, overlay, red, green, blue, pAlpha);
        matrices.pop();
    }
}
