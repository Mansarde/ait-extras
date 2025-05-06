package com.aitextras.core.blockentities;

import com.aitextras.core.AITExtrasBlockEntityTypes;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;


public class HatStandCrimsonBlockEntity extends BlockEntity {

    public HatStandCrimsonBlockEntity(BlockPos pos, BlockState state) {
        super(AITExtrasBlockEntityTypes.HAT_STAND_CRIMSON_BLOCK_ENTITY_TYPE, pos, state);
    }

    public float getScale() {
        return 1.2f; // Replace with logic to dynamically determine the scale if needed
    }


}

