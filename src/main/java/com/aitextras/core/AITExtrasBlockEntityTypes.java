package com.aitextras.core;


import com.aitextras.core.blockentities.ExtrasMonitorBlockEntity;
import com.aitextras.core.blockentities.ExtrasScreenMonitorBlockEntity;
import com.aitextras.core.blockentities.SunDialBlockEntity;
import dev.amble.lib.container.impl.BlockEntityContainer;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;

import net.minecraft.block.entity.BlockEntityType;


public class AITExtrasBlockEntityTypes implements BlockEntityContainer{

    public static BlockEntityType<ExtrasMonitorBlockEntity> EXTRAS_MONITOR_BLOCK_ENTITY_TYPE = FabricBlockEntityTypeBuilder
            .create(ExtrasMonitorBlockEntity::new, AITExtrasBlocks.EXTRAS_MONITOR_BLOCK).build();

    public static BlockEntityType<ExtrasScreenMonitorBlockEntity> EXTRAS_SCREEN_MONITOR_BLOCK_ENTITY_TYPE = FabricBlockEntityTypeBuilder
            .create(ExtrasScreenMonitorBlockEntity::new, AITExtrasBlocks.EXTRAS_SCREEN_MONITOR_BLOCK).build();

    public static BlockEntityType<SunDialBlockEntity> SUN_DIAL_BLOCK_ENTITY_TYPE = FabricBlockEntityTypeBuilder
            .create(SunDialBlockEntity::new, AITExtrasBlocks.SUN_DIAL_BLOCK).build();
}
