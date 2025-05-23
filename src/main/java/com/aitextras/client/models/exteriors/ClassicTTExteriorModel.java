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


public class ClassicTTExteriorModel extends ExteriorModel {
	private final ModelPart root;

	public ClassicTTExteriorModel() {
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

		ModelPartData body = bone.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -19.1F, 0.0F));

		ModelPartData top = body.addChild("top", ModelPartBuilder.create().uv(0, 72).cuboid(-4.9706F, -42.0F, -12.0F, 9.9411F, 8.0F, 24.0F, new Dilation(0.001F))
				.uv(96, 64).cuboid(-4.9706F, -45.0F, 11.0F, 9.9411F, 3.0F, 0.0F, new Dilation(0.001F))
				.uv(96, 67).cuboid(-4.9706F, -45.0F, -11.0F, 9.9411F, 3.0F, 0.0F, new Dilation(0.001F))
				.uv(0, 104).cuboid(-4.9706F, -46.0F, -10.0F, 9.9411F, 4.0F, 20.0F, new Dilation(0.001F))
				.uv(0, 0).cuboid(-12.0F, -42.1F, -12.0F, 24.0F, 0.0F, 24.0F, new Dilation(0.0F))
				.uv(0, 24).cuboid(-12.0F, -34.09F, -12.0F, 24.0F, 0.0F, 24.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 21.0F, 0.0F));

		ModelPartData octagon_r1 = top.addChild("octagon_r1", ModelPartBuilder.create().uv(60, 104).cuboid(-4.9706F, -46.0F, -10.0F, 9.9411F, 4.0F, 20.0F, new Dilation(0.001F))
				.uv(136, 101).cuboid(-4.9706F, -45.0F, -11.0F, 9.9411F, 3.0F, 0.0F, new Dilation(0.001F))
				.uv(136, 98).cuboid(-4.9706F, -45.0F, 11.0F, 9.9411F, 3.0F, 0.0F, new Dilation(0.001F))
				.uv(96, 32).cuboid(-4.9706F, -42.0F, -12.0F, 9.9411F, 8.0F, 24.0F, new Dilation(0.001F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData octagon_r2 = top.addChild("octagon_r2", ModelPartBuilder.create().uv(0, 128).cuboid(-3.9706F, -2.0F, -10.5F, 7.9411F, 4.0F, 21.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -44.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		ModelPartData octagon_r3 = top.addChild("octagon_r3", ModelPartBuilder.create().uv(120, 104).cuboid(-3.9706F, -46.0F, -10.5F, 7.9411F, 4.0F, 21.0F, new Dilation(0.0F))
				.uv(116, 67).cuboid(-4.9706F, -45.0F, -11.0F, 9.9411F, 3.0F, 0.0F, new Dilation(0.0F))
				.uv(116, 64).cuboid(-4.9706F, -45.0F, 11.0F, 9.9411F, 3.0F, 0.0F, new Dilation(0.0F))
				.uv(96, 0).cuboid(-4.9706F, -42.0F, -12.0F, 9.9411F, 8.0F, 24.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		ModelPartData octagon_r4 = top.addChild("octagon_r4", ModelPartBuilder.create().uv(156, 101).cuboid(-22.9706F, -45.0F, -11.0F, 9.9411F, 3.0F, 0.0F, new Dilation(0.0F))
				.uv(156, 98).cuboid(-22.9706F, -45.0F, 11.0F, 9.9411F, 3.0F, 0.0F, new Dilation(0.0F))
				.uv(68, 72).cuboid(-22.9706F, -42.0F, -12.0F, 9.9411F, 8.0F, 24.0F, new Dilation(0.0F)), ModelTransform.of(12.7279F, 0.0F, -12.7279F, 0.0F, 0.7854F, 0.0F));

		ModelPartData middle = body.addChild("middle", ModelPartBuilder.create().uv(82, 128).cuboid(-4.7635F, -34.0F, 9.5F, 9.5269F, 32.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 21.0F, 0.0F));

		ModelPartData octagon_r5 = middle.addChild("octagon_r5", ModelPartBuilder.create().uv(34, 153).cuboid(0.7635F, -16.0F, -1.0F, 4.0F, 32.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-7.4246F, -18.0F, -7.4246F, 0.0F, -2.3562F, 0.0F));

		ModelPartData octagon_r6 = middle.addChild("octagon_r6", ModelPartBuilder.create().uv(22, 153).cuboid(-4.7635F, -16.0F, -1.0F, 4.0F, 32.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(7.4246F, -18.0F, -7.4246F, 0.0F, 2.3562F, 0.0F));

		ModelPartData octagon_r7 = middle.addChild("octagon_r7", ModelPartBuilder.create().uv(130, 129).cuboid(-4.7635F, -34.0F, 9.5F, 9.5269F, 32.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		ModelPartData octagon_r8 = middle.addChild("octagon_r8", ModelPartBuilder.create().uv(136, 64).cuboid(-4.7635F, -34.0F, 9.5F, 9.5269F, 32.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData octagon_r9 = middle.addChild("octagon_r9", ModelPartBuilder.create().uv(106, 129).cuboid(-4.7635F, -34.0F, 9.5F, 9.5269F, 32.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData octagon_r10 = middle.addChild("octagon_r10", ModelPartBuilder.create().uv(58, 128).cuboid(-4.7635F, -34.0F, 9.5F, 9.5269F, 32.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		ModelPartData bottom = body.addChild("bottom", ModelPartBuilder.create().uv(0, 48).cuboid(-12.0F, -2.1F, -12.0F, 24.0F, 0.0F, 24.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 21.0F, 0.0F));

		ModelPartData Door = bone.addChild("Door", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -21.1F, 0.1F));

		ModelPartData octagon_r11 = Door.addChild("octagon_r11", ModelPartBuilder.create().uv(46, 153).cuboid(-3.7635F, -16.0F, -1.0F, 5.0F, 32.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-7.4246F, 5.0F, -7.4246F, 0.0F, -2.3562F, 0.0F));

		ModelPartData octagon_r12 = Door.addChild("octagon_r12", ModelPartBuilder.create().uv(0, 153).cuboid(-4.7635F, -16.0F, -1.4F, 9.5269F, 32.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 5.0F, -10.5F, 0.0F, 3.1416F, 0.0F));

		ModelPartData octagon_r13 = Door.addChild("octagon_r13", ModelPartBuilder.create().uv(154, 129).cuboid(-1.2365F, -16.0F, -1.0F, 5.0F, 32.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(7.4246F, 5.0F, -7.4246F, 0.0F, 2.3562F, 0.0F));
		return TexturedModelData.of(modelData, 256, 256);
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
			this.root.getChild("Door").yaw = exterior.tardis().get().door().isOpen() ? 1.575F : 0.0F;
		else {
			float maxRot = 90f;
			this.root.getChild("Door").yaw = (float) Math.toRadians(maxRot * exterior.tardis().get().door().getLeftRot());
		}
		matrices.scale(1.03f, 1f, 1.03f);
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
			this.root.getChild("Door").yaw = falling.tardis().get().door().isOpen() ? 1.575F : 0.0F;
		else {
			float maxRot = 90f;
			this.root.getChild("Door").yaw = (float) Math.toRadians(maxRot * falling.tardis().get().door().getLeftRot());
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
	public void renderDoors(ClientTardis clientTardis, ExteriorBlockEntity exteriorBlockEntity, ModelPart modelPart, MatrixStack matrixStack, VertexConsumer vertexConsumer, int i, int i1, float v, float v1, float v2, float v3, boolean b) {

	}

	@Override
	public ModelPart getPart() {
		return root; // Return the root part for rendering
	}


}