package com.aitextras.core.blockentities;

import com.aitextras.core.AITExtrasBlockEntityTypes;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;


public class HatStandWarpedBlockEntity extends BlockEntity {

    public HatStandWarpedBlockEntity(BlockPos pos, BlockState state) {
        super(AITExtrasBlockEntityTypes.HAT_STAND_WARPED_BLOCK_ENTITY_TYPE, pos, state);
    }

    public float getScale() {
        return 1.2f; // Replace with logic to dynamically determine the scale if needed
    }


}

