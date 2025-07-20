package com.aitextras.core.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class SealSmallBlock extends HorizontalFacingBlock {

    protected static final VoxelShape SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 32.0, 16.0);


    public SealSmallBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState()
                .with(FACING, Direction.NORTH));
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


    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        boolean isSneaking = ctx.getPlayer() != null && ctx.getPlayer().isSneaking();

        return this.getDefaultState()
                .with(FACING, ctx.getHorizontalPlayerFacing());

    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }


}
