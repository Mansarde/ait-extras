package com.aitextras.client.models.exteriors;

import dev.amble.ait.AITMod;
import dev.amble.ait.api.link.v2.Linkable;
import dev.amble.ait.client.models.exteriors.ExteriorModel;
import dev.amble.ait.core.blockentities.ExteriorBlockEntity;
import dev.amble.ait.core.tardis.handler.DoorHandler;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;


public class PostBoxExteriorModel extends ExteriorModel {
	private final ModelPart root;

	public PostBoxExteriorModel() {
		super();
		this.root = getTexturedModelData().createModel().getChild("bone");
	}

	public void renderWithAnimations(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		matrices.push();
		// Apply any transformations if needed
		root.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		matrices.pop();
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create().uv(2, 21).cuboid(-7.0F, -29.0F, -5.8636F, 1.0F, 28.0F, 13.0F, new Dilation(0.0F))
				.uv(1, 21).mirrored().cuboid(6.0F, -29.0F, -5.8636F, 1.0F, 28.0F, 13.0F, new Dilation(0.0F)).mirrored(false)
				.uv(0, 0).cuboid(-8.0F, -33.0F, -7.8636F, 16.0F, 2.0F, 16.0F, new Dilation(0.0F))
				.uv(72, 1).cuboid(-7.0F, -31.0F, -6.8636F, 14.0F, 2.0F, 14.0F, new Dilation(0.0F))
				.uv(28, 20).cuboid(-7.0F, -0.1F, -6.8636F, 14.0F, 0.0F, 14.0F, new Dilation(0.0F))
				.uv(38, 52).cuboid(-8.0F, -2.0F, -7.8636F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(42, 56).cuboid(-8.0F, -2.0F, -6.8636F, 2.0F, 2.0F, 13.0F, new Dilation(0.0F))
				.uv(38, 52).cuboid(7.0F, -2.0F, -7.8636F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, -0.1364F));

		ModelPartData cube_r1 = bone.addChild("cube_r1", ModelPartBuilder.create().uv(42, 75).cuboid(-1.0F, -1.0F, -6.5F, 2.0F, 2.0F, 13.0F, new Dilation(0.0F)), ModelTransform.of(7.0F, -1.0F, -0.3636F, 0.0F, 3.1416F, 0.0F));

		ModelPartData cube_r2 = bone.addChild("cube_r2", ModelPartBuilder.create().uv(37, 51).cuboid(-8.0F, -2.0F, -2.0F, 16.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 6.1364F, 0.0F, 3.1416F, 0.0F));

		ModelPartData cube_r3 = bone.addChild("cube_r3", ModelPartBuilder.create().uv(2, 22).mirrored().cuboid(-1.0F, -14.5F, -6.0F, 1.0F, 28.0F, 12.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(0.0F, -14.5F, 7.1364F, 0.0F, -1.5708F, 0.0F));

		ModelPartData door = bone.addChild("door", ModelPartBuilder.create().uv(34, 63).cuboid(-13.0F, -10.75F, 0.2F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
				.uv(34, 63).cuboid(-13.0F, -10.75F, -1.2F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
				.uv(39, 45).cuboid(-13.0F, 6.25F, -2.0F, 14.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(0, 64).cuboid(-13.0F, -20.75F, -1.0F, 14.0F, 28.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(6.0F, -8.25F, -5.8636F));
		return TexturedModelData.of(modelData, 128, 128);
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red,
					   float green, float blue, float alpha) {
		root.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public void renderWithAnimations(ExteriorBlockEntity exterior, ModelPart root, MatrixStack matrices,
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

		super.renderWithAnimations(exterior, root, matrices, vertices, light, overlay, red, green, blue, pAlpha);
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
	public ModelPart getPart() {
		return root; // Return the root part for rendering
	}

	@Override
	public void renderDoors(ExteriorBlockEntity exterior, ModelPart root, MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float pAlpha, boolean isBOTI) {}

}