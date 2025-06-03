package com.aitextras.client.models.exteriors;

import dev.amble.ait.AITMod;
import dev.amble.ait.api.tardis.link.v2.Linkable;
import dev.amble.ait.client.AITModClient;
import dev.amble.ait.client.models.exteriors.ExteriorModel;
import dev.amble.ait.client.tardis.ClientTardis;
import dev.amble.ait.core.blockentities.ExteriorBlockEntity;
import dev.amble.ait.core.tardis.handler.DoorHandler;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;


public class ClockExteriorModel<LinkableBlockEntity> extends ExteriorModel {
	private final ModelPart bone;

	public ClockExteriorModel() {
		super();
		this.bone = getTexturedModelData().createModel().getChild("bone");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create().uv(0, 19).cuboid(-9.0F, -4.0F, -7.0F, 18.0F, 2.0F, 14.0F, new Dilation(0.0F))
				.uv(0, 59).cuboid(-8.0F, -10.0F, -6.0F, 16.0F, 6.0F, 12.0F, new Dilation(0.0F))
				.uv(56, 65).cuboid(-8.0F, -39.0F, 4.0F, 16.0F, 28.0F, 2.0F, new Dilation(0.0F))
				.uv(22, 77).cuboid(7.0F, -39.0F, -6.0F, 1.0F, 28.0F, 10.0F, new Dilation(0.0F))
				.uv(0, 77).cuboid(-8.0F, -39.0F, -6.0F, 1.0F, 28.0F, 10.0F, new Dilation(0.0F))
				.uv(80, 95).cuboid(-8.0F, -50.0F, -7.0F, 1.0F, 39.0F, 1.0F, new Dilation(0.0F))
				.uv(84, 95).cuboid(7.0F, -50.0F, -7.0F, 1.0F, 39.0F, 1.0F, new Dilation(0.0F))
				.uv(137, 94).cuboid(7.0F, -50.0F, -7.0F, 1.0F, 39.0F, 1.0F, new Dilation(0.2F))
				.uv(137, 94).cuboid(-8.0F, -50.0F, -7.0F, 1.0F, 39.0F, 1.0F, new Dilation(0.2F))
				.uv(0, 35).cuboid(-8.0F, -52.0F, -6.0F, 16.0F, 12.0F, 12.0F, new Dilation(0.0F))
				.uv(148, 39).cuboid(-4.7F, -51.6F, -6.1F, 10.0F, 11.0F, 0.0F, new Dilation(0.0F))
				.uv(44, 111).cuboid(-9.0F, -52.0F, -7.0F, 3.0F, 2.0F, 14.0F, new Dilation(0.0F))
				.uv(44, 111).cuboid(6.0F, -52.0F, -7.0F, 3.0F, 2.0F, 14.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(-9.0F, -56.0F, -7.0F, 18.0F, 4.0F, 14.0F, new Dilation(0.0F))
				.uv(64, 0).cuboid(-7.0F, -58.0F, -7.0F, 14.0F, 2.0F, 14.0F, new Dilation(0.0F))
				.uv(0, 115).cuboid(-9.0F, -58.0F, -7.2F, 18.0F, 7.0F, 0.0F, new Dilation(0.0F))
				.uv(0, 115).cuboid(-9.0F, -58.0F, 7.2F, 18.0F, 7.0F, 0.0F, new Dilation(0.0F))
				.uv(120, 7).cuboid(-5.0F, -10.0F, -6.2F, 10.0F, 6.0F, 0.0F, new Dilation(0.0F))
				.uv(56, 35).cuboid(-9.0F, -11.0F, -7.0F, 18.0F, 1.0F, 14.0F, new Dilation(0.0F))
				.uv(56, 50).cuboid(-9.0F, -40.0F, -7.0F, 18.0F, 1.0F, 14.0F, new Dilation(0.0F))
				.uv(44, 95).cuboid(-9.0F, -2.0F, -7.0F, 4.0F, 2.0F, 14.0F, new Dilation(0.0F))
				.uv(44, 95).cuboid(5.0F, -2.0F, -7.0F, 4.0F, 2.0F, 14.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData door = bone.addChild("door", ModelPartBuilder.create().uv(92, 94).cuboid(0.0F, -28.0F, -0.1F, 14.0F, 28.0F, 0.0F, new Dilation(0.0F))
				.uv(130, 78).cuboid(12.7F, -15.1F, -0.6F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(92, 65).cuboid(0.0F, -28.0F, 0.0F, 14.0F, 28.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-7.0F, -11.0F, -6.0F));
		return TexturedModelData.of(modelData, 256, 256);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}


	@Override
	public void renderWithAnimations(ClientTardis tardis, ExteriorBlockEntity exterior, ModelPart clock, MatrixStack matrices,
									 VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float pAlpha) {
		if (exterior.tardis().isEmpty())
			return;

		matrices.push();
		if (!AITModClient.CONFIG.animateDoors)
			this.bone.getChild("door").yaw = exterior.tardis().get().door().isOpen() ? 1.575F : 0.0F;
		else {
			float maxRot = 90f;
			this.bone.getChild("door").yaw = (float) Math.toRadians(maxRot * exterior.tardis().get().door().getLeftRot());
		}
		matrices.scale(1f, 1f, 1f);
		matrices.translate(0, -1.5f, 0);

		super.renderWithAnimations(tardis, exterior, clock, matrices, vertices, light, overlay, red, green, blue, pAlpha);

		matrices.pop();
	}

	//@Override
	//public Animation getAnimationForDoorState(DoorHandler.AnimationDoorState state) {
		//return Animation.Builder.create(0).build();
	//}

	@Override
	public <T extends Entity & Linkable> void renderEntity(T falling, ModelPart clock, MatrixStack matrices,
														   VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		if (falling.tardis().isEmpty())
			return;

		matrices.push();
		if (!AITModClient.CONFIG.animateDoors)
			this.bone.getChild("door").yaw = falling.tardis().get().door().isOpen() ? 1.575F : 0.0F;
		else {
			float maxRot = 90f;
			this.bone.getChild("door").yaw = (float) Math.toRadians(maxRot * falling.tardis().get().door().getLeftRot());
		}
		matrices.scale(1f, 1f, 1f);
		matrices.translate(0, -1.5f, 0);

		super.renderEntity(falling, clock, matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		matrices.pop();
	}

	@Override
	public Animation getAnimationForDoorState(DoorHandler.AnimationDoorState state) {
		return Animation.Builder.create(0).build();
	}

	@Override
	public void renderDoors(ClientTardis clientTardis, ExteriorBlockEntity exteriorBlockEntity, ModelPart modelPart, MatrixStack matrixStack, VertexConsumer vertexConsumer, int i, int i1, float v, float v1, float v2, float v3, boolean isBOTI) {


	}

	@Override
	public ModelPart getPart() {
		return bone; // Return the bone part for rendering


	}



}