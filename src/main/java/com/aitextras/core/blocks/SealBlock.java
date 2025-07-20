package com.aitextras.core.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.Items;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class SealBlock extends HorizontalFacingBlock {

    protected static final VoxelShape SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 32.0, 16.0);
    public static final BooleanProperty CENTERED = BooleanProperty.of("centered");

    public SealBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState()
                .with(FACING, Direction.NORTH)
                .with(CENTERED, false));
    }


    @Override
    public VoxelShape getCollisionShape(BlockState state, net.minecraft.world.BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, net.minecraft.world.BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public boolean isShapeFullCube(BlockState state, net.minecraft.world.BlockView world, BlockPos pos) {
        return false;
    }


    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        boolean isSneaking = ctx.getPlayer() != null && ctx.getPlayer().isSneaking();

        return this.getDefaultState()
                .with(FACING, ctx.getHorizontalPlayerFacing())
                .with(CENTERED, isSneaking);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, CENTERED);
    }


    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos,
                              net.minecraft.entity.player.PlayerEntity player,
                              Hand hand, BlockHitResult hit) {

        if (!world.isClient) {
            boolean current = state.get(CENTERED);
            world.setBlockState(pos, state.with(CENTERED, !current));

            return ActionResult.SUCCESS;
        }

        return ActionResult.PASS;
    }
}
