package com.aitextras.core.blocks;

import com.aitextras.core.blockentities.CrystalBlockEntity;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.particle.BlockStateParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

public class CrystalBlock extends BlockWithEntity implements BlockEntityProvider {
    protected static final VoxelShape SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 32.0, 16.0);

    public CrystalBlock(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public boolean isShapeFullCube(BlockState state, BlockView world, BlockPos pos) {
        return false;
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new CrystalBlockEntity(pos, state);
    }


    @Override
    public VoxelShape getCullingShape(BlockState state, BlockView world, BlockPos pos) {
        return VoxelShapes.empty();
    }

    @Override
    public void onBroken(WorldAccess world, BlockPos pos, BlockState state) {
        if (world instanceof World clientWorld && clientWorld.isClient) {
            VoxelShape shape = state.getOutlineShape(clientWorld, pos);
            shape.forEachBox((minX, minY, minZ, maxX, maxY, maxZ) -> {
                for (int i = 0; i < 10; i++) {
                    double offsetX = clientWorld.random.nextDouble() * (maxX - minX) + minX;
                    double offsetY = clientWorld.random.nextDouble() * (maxY - minY) + minY;
                    double offsetZ = clientWorld.random.nextDouble() * (maxZ - minZ) + minZ;

                    clientWorld.addParticle(new BlockStateParticleEffect(ParticleTypes.BLOCK, state),
                            pos.getX() + offsetX,
                            pos.getY() + offsetY,
                            pos.getZ() + offsetZ,
                            0, 0, 0);
                }
            });
        }
        super.onBroken(world, pos, state);
    }

}

