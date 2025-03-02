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


public class EctoExteriorModel extends ExteriorModel {
	private final ModelPart root;

	public EctoExteriorModel() {
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

		ModelPartData TARDIS = bone.addChild("TARDIS", ModelPartBuilder.create().uv(0, 0).cuboid(-19.0F, -4.0F, -19.0F, 38.0F, 4.0F, 38.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData Posts = TARDIS.addChild("Posts", ModelPartBuilder.create().uv(46, 223).cuboid(-18.0F, -66.0F, -18.0F, 4.0F, 62.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r1 = Posts.addChild("cube_r1", ModelPartBuilder.create().uv(29, 198).cuboid(-18.0F, -66.0F, -18.0F, 4.0F, 62.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r2 = Posts.addChild("cube_r2", ModelPartBuilder.create().uv(210, 177).cuboid(-18.0F, -66.0F, -18.0F, 4.0F, 62.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData cube_r3 = Posts.addChild("cube_r3", ModelPartBuilder.create().uv(218, 41).cuboid(-18.0F, -66.0F, -18.0F, 4.0F, 62.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r4 = Posts.addChild("cube_r4", ModelPartBuilder.create().uv(0, 423).mirrored().cuboid(-9.5F, -29.0F, 2.0F, 15.0F, 52.0F, 0.0F, new Dilation(0.0F)).mirrored(false)
				.uv(12, 473).mirrored().cuboid(-9.5F, -21.0F, 2.0F, 15.0F, 32.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(25.5F, -35.0F, 23.0F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r5 = Posts.addChild("cube_r5", ModelPartBuilder.create().uv(12, 473).cuboid(-5.5F, -21.0F, -2.0F, 15.0F, 32.0F, 0.0F, new Dilation(0.0F))
				.uv(0, 423).cuboid(-5.5F, -29.0F, -2.0F, 15.0F, 52.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-25.5F, -35.0F, -23.0F, 0.0F, -0.7854F, 0.0F));

		ModelPartData Doors = TARDIS.addChild("Doors", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData right_door = Doors.addChild("right_door", ModelPartBuilder.create().uv(181, 177).cuboid(0.5F, -29.5F, -0.5F, 13.0F, 55.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 198).cuboid(0.5F, -29.5F, -1.3F, 14.0F, 55.0F, 0.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(11.5F, -10.5F, -1.5F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-13.5F, -29.5F, -15.5F));

		ModelPartData left_door = Doors.addChild("left_door", ModelPartBuilder.create().uv(189, 41).cuboid(-13.5F, -29.5F, -0.5F, 13.0F, 55.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(-12.5F, -10.5F, -1.5F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(13.5F, -29.5F, -15.5F, 0.0F, -0.0436F, 0.0F));

		ModelPartData Walls = TARDIS.addChild("Walls", ModelPartBuilder.create().uv(60, 430).mirrored().cuboid(-21.0F, -43.0F, 13.6F, 6.0F, 31.0F, 6.0F, new Dilation(0.0F)).mirrored(false)
				.uv(129, 15).cuboid(-16.0F, -60.0F, -14.0F, 1.0F, 56.0F, 28.0F, new Dilation(0.0F))
				.uv(59, 142).cuboid(-16.5F, -60.0F, -14.0F, 0.0F, 56.0F, 28.0F, new Dilation(0.0F))
				.uv(63, 227).cuboid(-14.0F, -60.0F, -16.0F, 1.0F, 56.0F, 1.0F, new Dilation(0.0F))
				.uv(116, 170).cuboid(13.0F, -60.0F, -16.0F, 1.0F, 56.0F, 1.0F, new Dilation(0.0F))
				.uv(115, 0).cuboid(-13.0F, -60.0F, -16.0F, 26.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(59, 113).cuboid(13.0F, -60.0F, -16.5F, 1.0F, 56.0F, 0.0F, new Dilation(0.0F))
				.uv(115, 3).cuboid(-13.0F, -60.0F, -16.5F, 26.0F, 1.0F, 0.0F, new Dilation(0.0F))
				.uv(62, 113).cuboid(-14.0F, -60.0F, -16.5F, 1.0F, 56.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData Wall_r1 = Walls.addChild("Wall_r1", ModelPartBuilder.create().uv(160, 72).cuboid(-16.5F, -60.0F, -14.0F, 0.0F, 56.0F, 28.0F, new Dilation(0.0F))
				.uv(93, 85).cuboid(-16.0F, -60.0F, -14.0F, 1.0F, 56.0F, 28.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData Wall_r2 = Walls.addChild("Wall_r2", ModelPartBuilder.create().uv(0, 293).cuboid(0.0F, -9.0F, -5.0F, 0.0F, 12.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, -52.1F, 18.65F, 1.5708F, 1.309F, 1.5708F));

		ModelPartData Wall_r3 = Walls.addChild("Wall_r3", ModelPartBuilder.create().uv(0, 293).cuboid(0.0F, -3.0F, -5.0F, 0.0F, 12.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, -13.9F, 18.65F, -1.5708F, 1.309F, -1.5708F));

		ModelPartData Wall_r4 = Walls.addChild("Wall_r4", ModelPartBuilder.create().uv(28, 317).cuboid(-5.0F, 0.0F, 2.0F, 5.0F, 14.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(7.0F, -20.0F, 16.25F, 0.0F, 1.5708F, 0.0F));

		ModelPartData Wall_r5 = Walls.addChild("Wall_r5", ModelPartBuilder.create().uv(28, 317).cuboid(-5.0F, 0.0F, 2.0F, 5.0F, 14.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(7.0F, -35.0F, 16.25F, 0.0F, 1.5708F, 0.0F));

		ModelPartData Wall_r6 = Walls.addChild("Wall_r6", ModelPartBuilder.create().uv(0, 293).cuboid(0.0F, -14.0F, -3.0F, 0.0F, 36.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(-7.0F, -37.0F, 19.25F, 0.0F, 1.5708F, 0.0F));

		ModelPartData Wall_r7 = Walls.addChild("Wall_r7", ModelPartBuilder.create().uv(124, 142).cuboid(-16.75F, -60.0F, -14.0F, 0.0F, 56.0F, 28.0F, new Dilation(0.0F))
				.uv(0, 113).cuboid(-16.0F, -60.0F, -14.0F, 1.0F, 56.0F, 28.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData PCB = TARDIS.addChild("PCB", ModelPartBuilder.create().uv(181, 167).cuboid(-17.0F, -64.0F, -19.0F, 34.0F, 5.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.0F, 0.0F));

		ModelPartData cube_r6 = PCB.addChild("cube_r6", ModelPartBuilder.create().uv(153, 157).cuboid(-17.0F, -61.0F, -19.0F, 34.0F, 5.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -3.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r7 = PCB.addChild("cube_r7", ModelPartBuilder.create().uv(160, 21).cuboid(-17.0F, -61.0F, -19.0F, 34.0F, 5.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -3.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData cube_r8 = PCB.addChild("cube_r8", ModelPartBuilder.create().uv(160, 31).cuboid(-17.0F, -61.0F, -19.0F, 34.0F, 5.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -3.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData Roof = TARDIS.addChild("Roof", ModelPartBuilder.create().uv(0, 43).cuboid(-16.0F, -68.0F, -16.0F, 32.0F, 4.0F, 32.0F, new Dilation(0.0F))
				.uv(0, 43).cuboid(-17.0F, -67.5F, -17.0F, 3.0F, 4.0F, 3.0F, new Dilation(0.05F))
				.uv(22, 7).cuboid(-17.0F, -67.5F, 14.0F, 3.0F, 4.0F, 3.0F, new Dilation(0.05F))
				.uv(0, 30).cuboid(14.0F, -67.5F, -17.0F, 3.0F, 4.0F, 3.0F, new Dilation(0.05F))
				.uv(17, 26).cuboid(14.0F, -67.5F, 14.0F, 3.0F, 4.0F, 3.0F, new Dilation(0.05F))
				.uv(0, 80).cuboid(-15.0F, -70.0F, -15.0F, 30.0F, 2.0F, 30.0F, new Dilation(0.0F))
				.uv(0, 382).cuboid(-10.0F, -76.0F, -13.0F, 20.0F, 6.0F, 26.0F, new Dilation(0.0F))
				.uv(45, 317).cuboid(-12.0F, -74.0F, -14.0F, 2.0F, 4.0F, 0.0F, new Dilation(0.0F))
				.uv(45, 317).mirrored().cuboid(10.0F, -74.0F, -14.0F, 2.0F, 4.0F, 0.0F, new Dilation(0.0F)).mirrored(false)
				.uv(40, 345).cuboid(10.0F, -74.0F, -13.0F, 4.0F, 4.0F, 26.0F, new Dilation(0.0F))
				.uv(40, 345).mirrored().cuboid(-14.0F, -74.0F, -13.0F, 4.0F, 4.0F, 26.0F, new Dilation(0.0F)).mirrored(false)
				.uv(0, 0).cuboid(-3.0F, -77.0F, -3.0F, 6.0F, 2.0F, 6.0F, new Dilation(0.0F))
				.uv(0, 374).cuboid(-4.0F, -75.0F, -4.0F, 8.0F, 5.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.0F, 0.0F));

		ModelPartData cube_r9 = Roof.addChild("cube_r9", ModelPartBuilder.create().uv(0, 18).cuboid(-2.0F, -70.75F, -2.0F, 4.0F, 5.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -11.25F, 0.0F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r10 = Roof.addChild("cube_r10", ModelPartBuilder.create().uv(80, 333).cuboid(-3.0F, -2.0F, -1.0F, 0.0F, 5.0F, 3.0F, new Dilation(0.0F))
				.uv(86, 333).cuboid(3.0F, -2.0F, -1.0F, 0.0F, 5.0F, 3.0F, new Dilation(0.0F))
				.uv(80, 333).cuboid(-3.0F, 3.0F, -1.0F, 6.0F, 0.0F, 3.0F, new Dilation(0.0F))
				.uv(92, 336).cuboid(-3.0F, -2.0F, 2.0F, 6.0F, 5.0F, 0.0F, new Dilation(0.0F))
				.uv(80, 333).cuboid(-3.0F, -2.0F, -1.0F, 6.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-9.0F, -79.0F, 2.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r11 = Roof.addChild("cube_r11", ModelPartBuilder.create().uv(64, 333).cuboid(-2.0F, -1.0F, -1.0F, 4.0F, 3.0F, 3.0F, new Dilation(0.0F))
				.uv(68, 324).cuboid(-1.0F, 2.0F, 0.0F, 2.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-6.0F, -79.0F, 2.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r12 = Roof.addChild("cube_r12", ModelPartBuilder.create().uv(80, 333).mirrored().cuboid(-3.0F, -2.0F, -1.0F, 6.0F, 0.0F, 3.0F, new Dilation(0.0F)).mirrored(false)
				.uv(80, 333).mirrored().cuboid(-3.0F, 3.0F, -1.0F, 6.0F, 0.0F, 3.0F, new Dilation(0.0F)).mirrored(false)
				.uv(80, 333).mirrored().cuboid(-3.0F, -2.0F, -1.0F, 0.0F, 5.0F, 3.0F, new Dilation(0.0F)).mirrored(false)
				.uv(86, 333).mirrored().cuboid(3.0F, -2.0F, -1.0F, 0.0F, 5.0F, 3.0F, new Dilation(0.0F)).mirrored(false)
				.uv(92, 336).mirrored().cuboid(-3.0F, -2.0F, 2.0F, 6.0F, 5.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(9.0F, -79.0F, 2.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r13 = Roof.addChild("cube_r13", ModelPartBuilder.create().uv(64, 333).mirrored().cuboid(-2.0F, -1.0F, -1.0F, 4.0F, 3.0F, 3.0F, new Dilation(0.0F)).mirrored(false)
				.uv(68, 324).mirrored().cuboid(-1.0F, 2.0F, 0.0F, 2.0F, 7.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(6.0F, -79.0F, 2.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r14 = Roof.addChild("cube_r14", ModelPartBuilder.create().uv(50, 317).mirrored().cuboid(-2.0F, -2.0F, -0.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)).mirrored(false)
				.uv(51, 324).mirrored().cuboid(-2.0F, 2.0F, -1.25F, 4.0F, 0.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
				.uv(51, 324).mirrored().cuboid(-2.0F, -2.0F, -1.25F, 4.0F, 0.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
				.uv(51, 324).mirrored().cuboid(-2.0F, -2.0F, -1.25F, 0.0F, 4.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
				.uv(55, 324).mirrored().cuboid(2.0F, -2.0F, -1.25F, 0.0F, 4.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(11.0F, -75.0F, -14.75F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r15 = Roof.addChild("cube_r15", ModelPartBuilder.create().uv(51, 324).cuboid(-2.0F, -2.0F, -1.25F, 4.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(51, 324).cuboid(-2.0F, -2.0F, -1.25F, 0.0F, 4.0F, 1.0F, new Dilation(0.0F))
				.uv(55, 324).cuboid(2.0F, -2.0F, -1.25F, 0.0F, 4.0F, 1.0F, new Dilation(0.0F))
				.uv(51, 324).cuboid(-2.0F, 2.0F, -1.25F, 4.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(50, 317).cuboid(-2.0F, -2.0F, -0.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-11.0F, -75.0F, -14.75F, 0.0F, 0.0F, -0.7854F));

		ModelPartData cube_r16 = Roof.addChild("cube_r16", ModelPartBuilder.create().uv(28, 305).cuboid(-14.0F, -2.5F, 0.0F, 28.0F, 5.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -68.5F, -17.0F, -0.4363F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 512, 512);
	}

	@Override
	public void renderWithAnimations(ExteriorBlockEntity exterior, ModelPart root, MatrixStack matrices,
									 VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float pAlpha) {
		if (exterior.tardis().isEmpty())
			return;

		matrices.push();
		matrices.scale(0.63F, 0.63F, 0.63F);
		matrices.translate(0, -1.5f, 0);

		DoorHandler door = exterior.tardis().get().door();

		if (!AITMod.CONFIG.CLIENT.ANIMATE_DOORS) {
			this.root.getChild("TARDIS").getChild("Doors").getChild("left_door").yaw = (door.isLeftOpen() || door.isOpen()) ? -5.0F : 0.0F;
			this.root.getChild("TARDIS").getChild("Doors").getChild("right_door").yaw = (door.isRightOpen() || door.areBothOpen())
					? 5.0F
					: 0.0F;
		} else {
			float maxRot = 90f;
			this.root.getChild("TARDIS").getChild("Doors").getChild("left_door").yaw = (float) Math.toRadians(maxRot * door.getLeftRot());
			this.root.getChild("TARDIS").getChild("Doors").getChild("right_door").yaw = (float) -Math.toRadians(maxRot * door.getRightRot());
		}

		super.renderWithAnimations(exterior, root, matrices, vertices, light, overlay, red, green, blue, pAlpha);
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
			this.root.getChild("TARDIS").getChild("Doors").getChild("left_door").yaw = (door.isLeftOpen() || door.isOpen()) ? 5F : 0.0F;
			this.root.getChild("TARDIS").getChild("Doors").getChild("right_door").yaw = (door.isRightOpen() || door.areBothOpen())
					? -5F
					: 0.0F;
		} else {
			float maxRot = 90f;
			this.root.getChild("TARDIS").getChild("Doors").getChild("left_door").yaw = (float) -Math.toRadians(maxRot * door.getLeftRot());
			this.root.getChild("TARDIS").getChild("Doors").getChild("right_door").yaw = (float) Math.toRadians(maxRot * door.getRightRot());
		}

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