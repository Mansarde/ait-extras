package com.aitextras.core;

import com.aitextras.core.blocks.ExtrasMonitorBlock;
import dev.amble.lib.container.impl.BlockContainer;
import dev.amble.lib.datagen.util.NoEnglish;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.enums.Instrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;

public class AITExtrasBlocks extends BlockContainer {

    @NoEnglish
    public static final Block EXTRAS_MONITOR_BLOCK = new ExtrasMonitorBlock(FabricBlockSettings.create().nonOpaque().requiresTool()
            .instrument(Instrument.COW_BELL).strength(1.5F, 6.0F).pistonBehavior(PistonBehavior.DESTROY));


    static {

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.addAfter(Items.WARPED_HANGING_SIGN, EXTRAS_MONITOR_BLOCK);
        });
    }
};
