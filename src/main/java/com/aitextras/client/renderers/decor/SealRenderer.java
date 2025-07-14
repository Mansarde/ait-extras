package com.aitextras.client.renderers.decor;

import com.aitextras.AITExtras;
import com.aitextras.client.models.decor.SealModel;
import com.aitextras.core.blockentities.SealBlockEntity;
import net.minecraft.block.BlockState;
import net.minecraft.block.SkullBlock;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.RotationPropertyHelper;

public class SealRenderer<T extends SealBlockEntity> implements BlockEntityRenderer<T> {

    public static final Identifier SEAL_TEXTURE = new Identifier(AITExtras.MOD_ID,
            "textures/blockentities/decor/seal.png");
    private final SealModel sealModel;

    public SealRenderer(BlockEntityRendererFactory.Context ctx) {
        this.sealModel = new SealModel(SealModel.getTexturedModelData().createModel());
    }

    @Override
    public void render(T entity, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        BlockState blockState = entity.getCachedState();

        int k = blockState.get(SkullBlock.ROTATION);
        float h = RotationPropertyHelper.toDegrees(k);

        matrices.push();
        matrices.translate(0.5f, 1.5f, 0.5f);
        matrices.multiply(RotationAxis.NEGATIVE_Y.rotationDegrees(h));
        matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(180));

        // Retrieve scale dynamically and apply it
        float scale = entity.getScale();
        matrices.scale(scale, scale, scale);

        this.sealModel.render(matrices,
                vertexConsumers.getBuffer(RenderLayer.getEntityTranslucent(SEAL_TEXTURE)), light, overlay, 1.0F,
                1.0F, 1.0F, 1.0F);

        matrices.pop();
    }
}