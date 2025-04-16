package com.aitextras.client.models.exteriors;

import dev.amble.ait.AITMod;
import dev.amble.ait.api.tardis.link.v2.Linkable;
import dev.amble.ait.api.tardis.link.v2.block.AbstractLinkableBlockEntity;
import dev.amble.ait.client.models.exteriors.ExteriorModel;
import dev.amble.ait.client.tardis.ClientTardis;
import dev.amble.ait.core.blockentities.ExteriorBlockEntity;
import dev.amble.ait.core.tardis.handler.DoorHandler;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;


public class VanillaExteriorModel<LinkableBlockEntity> extends ExteriorModel {
	private final ModelPart root;

	public VanillaExteriorModel() {
		super();
		this.root = getTexturedModelData().createModel().getChild("bone");
	}public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create().uv(0, 0).cuboid(-24.0F, -32.0F, -8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(-24.0F, -32.0F, -24.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(-24.0F, -16.0F, -24.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(-24.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(-24.0F, -16.0F, 8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(-8.0F, -16.0F, 8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(-8.0F, -32.0F, 8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(-8.0F, -48.0F, 8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(8.0F, -32.0F, 8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(8.0F, -32.0F, -8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(8.0F, -32.0F, -24.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(8.0F, -48.0F, 8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(8.0F, -48.0F, -8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(8.0F, -48.0F, -24.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(-24.0F, -48.0F, 8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(-24.0F, -48.0F, -8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(-24.0F, -48.0F, -24.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
				.uv(64, 23).cuboid(-24.0F, -56.0F, -24.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F))
				.uv(64, 23).cuboid(-8.0F, -56.0F, -24.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F))
				.uv(64, 23).cuboid(8.0F, -56.0F, -24.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F))
				.uv(64, 23).cuboid(8.0F, -56.0F, 8.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F))
				.uv(64, 23).cuboid(-8.0F, -56.0F, 8.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F))
				.uv(64, 23).cuboid(-24.0F, -56.0F, 8.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F))
				.uv(64, 23).cuboid(8.0F, -56.0F, -8.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F))
				.uv(64, 23).cuboid(-24.0F, -56.0F, -8.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(-8.0F, -48.0F, -24.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(-24.0F, -32.0F, 8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(8.0F, -16.0F, -24.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(8.0F, -16.0F, 8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData signs = bone.addChild("signs", ModelPartBuilder.create().uv(64, 0).cuboid(-40.0F, -4.0F, -1.0F, 16.0F, 8.0F, 2.0F, new Dilation(0.0F))
				.uv(64, 0).cuboid(-24.0F, -4.0F, -1.0F, 16.0F, 8.0F, 2.0F, new Dilation(0.0F))
				.uv(64, 0).cuboid(-8.0F, -4.0F, -1.0F, 16.0F, 8.0F, 2.0F, new Dilation(0.0F))
				.uv(64, 0).cuboid(-8.1F, -4.0F, 49.0F, 16.0F, 8.0F, 2.0F, new Dilation(0.0F))
				.uv(64, 0).cuboid(-24.1F, -4.0F, 49.0F, 16.0F, 8.0F, 2.0F, new Dilation(0.0F))
				.uv(64, 0).cuboid(-40.1F, -4.0F, 49.0F, 16.0F, 8.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(16.0F, -40.0F, -25.0F));

		ModelPartData cube_r1 = signs.addChild("cube_r1", ModelPartBuilder.create().uv(64, 0).cuboid(8.05F, -4.0F, -26.0F, 16.0F, 8.0F, 2.0F, new Dilation(0.0F))
				.uv(64, 0).cuboid(-23.95F, -4.0F, -26.0F, 16.0F, 8.0F, 2.0F, new Dilation(0.0F))
				.uv(64, 0).cuboid(-7.95F, -4.0F, -26.0F, 16.0F, 8.0F, 2.0F, new Dilation(0.0F))
				.uv(64, 0).cuboid(-24.05F, -4.0F, 24.0F, 16.0F, 8.0F, 2.0F, new Dilation(0.0F))
				.uv(64, 0).cuboid(-8.05F, -4.0F, 24.0F, 16.0F, 8.0F, 2.0F, new Dilation(0.0F))
				.uv(64, 0).cuboid(7.95F, -4.0F, 24.0F, 16.0F, 8.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-16.05F, 0.0F, 25.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData lamp = bone.addChild("lamp", ModelPartBuilder.create().uv(0, 32).cuboid(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -48.0F, 0.0F));

		ModelPartData door = bone.addChild("door", ModelPartBuilder.create().uv(0, 64).cuboid(-1.5F, -23.75F, -1.3F, 16.0F, 32.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(-6.5F, -8.25F, -22.7F));
		return TexturedModelData.of(modelData, 128, 128);
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red,
					   float green, float blue, float alpha) {
		root.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public void renderWithAnimations(ClientTardis tardis, ExteriorBlockEntity exterior, ModelPart root, MatrixStack matrices,
									 VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float pAlpha) {
		if (exterior.tardis().isEmpty())
			return;

		matrices.push();
		if (!AITMod.CONFIG.CLIENT.ANIMATE_DOORS)
			this.root.getChild("door").yaw = exterior.tardis().get().door().isOpen() ? 1.575F : 0.0F;
		else {
			float maxRot = -90f;
			this.root.getChild("door").yaw = (float) Math.toRadians(maxRot * exterior.tardis().get().door().getLeftRot());
		}
		matrices.scale(1f, 1f, 1f);
		matrices.translate(0, -1.5f, 0);

		super.renderWithAnimations(tardis, exterior, root, matrices, vertices, light, overlay, red, green, blue, pAlpha);

		matrices.pop();
	}

	//@Override
	//public Animation getAnimationForDoorState(DoorHandler.AnimationDoorState state) {
		//return Animation.Builder.create(0).build();
	//}

	@Override
	public <T extends Entity & Linkable> void renderEntity(T falling, ModelPart root, MatrixStack matrices,
														   VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		if (falling.tardis().isEmpty())
			return;

		matrices.push();
		if (!AITMod.CONFIG.CLIENT.ANIMATE_DOORS)
			this.root.getChild("door").yaw = falling.tardis().get().door().isOpen() ? 1.575F : 0.0F;
		else {
			float maxRot = -90f;
			this.root.getChild("door").yaw = (float) Math.toRadians(maxRot * falling.tardis().get().door().getLeftRot());
		}
		matrices.scale(1f, 1f, 1f);
		matrices.translate(0, -1.5f, 0);

		super.renderEntity(falling, root, matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
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
		return root; // Return the root part for rendering


	}



}