package com.aitextras.client.models.exteriors;

import dev.amble.ait.AITMod;
import dev.amble.ait.api.tardis.link.v2.Linkable;
import dev.amble.ait.client.models.exteriors.ExteriorModel;
import dev.amble.ait.client.tardis.ClientTardis;
import dev.amble.ait.core.blockentities.ExteriorBlockEntity;
import dev.amble.ait.core.tardis.handler.DoorHandler;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;


public class BoxExteriorModel extends ExteriorModel {
	private final ModelPart root;

	public BoxExteriorModel() {
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
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData Doors = bone.addChild("Doors", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -1.0F, -1.0F));

		ModelPartData right_door = Doors.addChild("right_door", ModelPartBuilder.create().uv(194, 81).cuboid(-0.5F, -25.5F, -0.5F, 13.0F, 53.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 209).cuboid(-0.5F, -25.5F, -1.0F, 13.0F, 53.0F, 0.0F, new Dilation(0.0F))
				.uv(108, 128).cuboid(9.5F, -7.5F, -1.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-12.5F, -29.5F, -14.5F));

		ModelPartData left_door = Doors.addChild("left_door", ModelPartBuilder.create().uv(0, 263).cuboid(-12.5F, -25.5F, -1.0F, 13.0F, 53.0F, 0.0F, new Dilation(0.0F))
				.uv(166, 81).cuboid(-12.5F, -25.5F, -0.5F, 13.0F, 53.0F, 1.0F, new Dilation(0.0F))
				.uv(103, 128).cuboid(-12.5F, -8.5F, -1.5F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(12.5F, -29.5F, -14.5F));

		ModelPartData TARDIS = bone.addChild("TARDIS", ModelPartBuilder.create().uv(0, 0).cuboid(-18.0F, -2.0F, -18.0F, 36.0F, 3.0F, 36.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.0F, 0.0F));

		ModelPartData Posts = TARDIS.addChild("Posts", ModelPartBuilder.create().uv(144, 0).cuboid(-17.0F, -64.0F, -17.0F, 4.0F, 62.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r1 = Posts.addChild("cube_r1", ModelPartBuilder.create().uv(86, 208).cuboid(-18.0F, -66.0F, -18.0F, 4.0F, 62.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, 2.0F, -1.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r2 = Posts.addChild("cube_r2", ModelPartBuilder.create().uv(70, 208).cuboid(-18.0F, -66.0F, -18.0F, 4.0F, 62.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, 2.0F, -1.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData cube_r3 = Posts.addChild("cube_r3", ModelPartBuilder.create().uv(54, 208).cuboid(-17.0F, -66.0F, -18.0F, 4.0F, 62.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, 2.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData Walls = TARDIS.addChild("Walls", ModelPartBuilder.create().uv(54, 128).cuboid(-15.0F, -56.0F, -13.0F, 1.0F, 54.0F, 26.0F, new Dilation(0.0F))
				.uv(166, 0).cuboid(-15.5F, -57.0F, -13.0F, 0.0F, 55.0F, 26.0F, new Dilation(0.0F))
				.uv(212, 171).cuboid(-13.0F, -57.0F, -15.0F, 26.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(212, 174).cuboid(-13.0F, -57.0F, -15.5F, 26.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData Wall_r1 = Walls.addChild("Wall_r1", ModelPartBuilder.create().uv(108, 151).cuboid(-15.5F, -57.0F, -13.0F, 0.0F, 55.0F, 26.0F, new Dilation(0.0F))
				.uv(0, 128).cuboid(-15.0F, -57.0F, -13.0F, 1.0F, 55.0F, 26.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData Wall_r2 = Walls.addChild("Wall_r2", ModelPartBuilder.create().uv(160, 151).cuboid(-15.75F, -57.0F, -13.0F, 0.0F, 55.0F, 26.0F, new Dilation(0.0F))
				.uv(112, 70).cuboid(-15.0F, -57.0F, -13.0F, 1.0F, 55.0F, 26.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData PCB = TARDIS.addChild("PCB", ModelPartBuilder.create().uv(166, 135).cuboid(-15.0F, -62.0F, -18.0F, 30.0F, 6.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.0F, 0.0F));

		ModelPartData cube_r4 = PCB.addChild("cube_r4", ModelPartBuilder.create().uv(212, 162).cuboid(-15.0F, -60.0F, -18.0F, 30.0F, 6.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r5 = PCB.addChild("cube_r5", ModelPartBuilder.create().uv(212, 153).cuboid(-15.0F, -60.0F, -18.0F, 30.0F, 6.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData cube_r6 = PCB.addChild("cube_r6", ModelPartBuilder.create().uv(212, 144).cuboid(-15.0F, -60.0F, -18.0F, 30.0F, 6.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData Roof = TARDIS.addChild("Roof", ModelPartBuilder.create().uv(0, 39).cuboid(-15.0F, -63.0F, -15.0F, 30.0F, 1.0F, 30.0F, new Dilation(0.0F))
				.uv(0, 100).cuboid(-14.0F, -55.0F, -14.0F, 28.0F, 0.0F, 28.0F, new Dilation(0.0F))
				.uv(148, 66).cuboid(-16.5F, -64.0F, -16.5F, 3.0F, 1.0F, 3.0F, new Dilation(0.05F))
				.uv(190, 144).cuboid(-16.5F, -64.0F, 13.5F, 3.0F, 1.0F, 3.0F, new Dilation(0.05F))
				.uv(166, 144).cuboid(13.5F, -64.0F, -16.5F, 3.0F, 1.0F, 3.0F, new Dilation(0.05F))
				.uv(178, 144).cuboid(13.5F, -64.0F, 13.5F, 3.0F, 1.0F, 3.0F, new Dilation(0.05F))
				.uv(0, 70).cuboid(-14.0F, -65.0F, -14.0F, 28.0F, 2.0F, 28.0F, new Dilation(0.0F))
				.uv(120, 39).cuboid(-3.0F, -67.0F, -3.0F, 6.0F, 4.0F, 6.0F, new Dilation(0.0F))
				.uv(120, 49).cuboid(-3.0F, -72.0F, -3.0F, 6.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.0F, 0.0F));

		ModelPartData cube_r7 = Roof.addChild("cube_r7", ModelPartBuilder.create().uv(120, 56).cuboid(-2.0F, -70.75F, -2.0F, 4.0F, 6.0F, 4.0F, new Dilation(0.0F))
				.uv(134, 66).cuboid(-3.5F, -68.75F, 0.0F, 7.0F, 4.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.25F, 0.0F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r8 = Roof.addChild("cube_r8", ModelPartBuilder.create().uv(120, 66).cuboid(-3.5F, -70.75F, 0.0F, 7.0F, 4.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 0.0F, 0.0F, -0.7854F, 0.0F));
		return TexturedModelData.of(modelData, 512, 512);
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red,
					   float green, float blue, float alpha) {
		root.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return root;
	}

	@Override
	public void renderWithAnimations(ClientTardis tardis, ExteriorBlockEntity exterior, ModelPart root, MatrixStack matrices,
									 VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float pAlpha) {
		matrices.push();
		matrices.scale(0.63F, 0.63F, 0.63F);
		matrices.translate(0, -1.5f, 0);

		this.renderDoors(tardis, exterior, root, matrices, vertices, light, overlay, red, green, blue, pAlpha, false);

		super.renderWithAnimations(tardis, exterior, root, matrices, vertices, light, overlay, red, green, blue, pAlpha);
		matrices.pop();
	}

	@Override
	public <T extends Entity & Linkable> void renderEntity(T falling, ModelPart root, MatrixStack matrices,
														   VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		if (!falling.isLinked())
			return;

		matrices.push();
		matrices.scale(0.63F, 0.63F, 0.63F);
		matrices.translate(0, -1.5f, 0);

		DoorHandler door = falling.tardis().get().door();

		if (!AITMod.CONFIG.CLIENT.ANIMATE_DOORS) {
			this.root.getChild("Doors").getChild("left_door").yaw = (door.isLeftOpen() || door.isOpen()) ? -5F : 0.0F;
			this.root.getChild("Doors").getChild("right_door").yaw = (door.isRightOpen() || door.areBothOpen())
					? 5F
					: 0.0F;
		} else {
			float maxRot = -90f;
			this.root.getChild("Doors").getChild("left_door").yaw =(float) Math.toRadians(maxRot*door.getLeftRot());
			this.root.getChild("Doors").getChild("right_door").yaw =(float) -Math.toRadians(maxRot*door.getRightRot());
		}

		super.renderEntity(falling, root, matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		matrices.pop();
	}

	@Override
	public Animation getAnimationForDoorState(DoorHandler.AnimationDoorState state) {
		return Animation.Builder.create(0).build();
	}

	@Override
	public void renderDoors(ClientTardis tardis, ExteriorBlockEntity exterior, ModelPart root, MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float pAlpha, boolean isBOTI) {
		DoorHandler door = tardis.door();

		if (!AITMod.CONFIG.CLIENT.ANIMATE_DOORS) {
			this.root.getChild("Doors").getChild("left_door").yaw = (door.isLeftOpen() || door.isOpen()) ? -5F : 0.0F;
			this.root.getChild("Doors").getChild("right_door").yaw = (door.isRightOpen() || door.areBothOpen())
					? 5F
					: 0.0F;
		} else {
			float maxRot = -90f;
			this.root.getChild("Doors").getChild("left_door").yaw =(float) Math.toRadians(maxRot*door.getLeftRot());
			this.root.getChild("Doors").getChild("right_door").yaw =(float) -Math.toRadians(maxRot*door.getRightRot());
		}

		if (isBOTI) {
			matrices.push();
			matrices.scale(0.63F, 0.63F, 0.63F);
			matrices.translate(0, 0f, -0.01);
			this.root.getChild("Doors").render(matrices, vertices, light, overlay, red, green, blue, pAlpha);
			matrices.pop();
		}
	}
}
