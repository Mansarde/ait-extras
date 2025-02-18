package com.aitextras.core;

import com.aitextras.core.blocks.ExtrasMonitorBlock;
import com.aitextras.core.blocks.ExtrasScreenMonitorBlock;
import dev.amble.lib.container.impl.BlockContainer;
import dev.amble.lib.datagen.util.NoEnglish;
import dev.amble.lib.datagen.util.PickaxeMineable;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.enums.Instrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;

public class AITExtrasBlocks extends BlockContainer {

    @PickaxeMineable(tool = PickaxeMineable.Tool.IRON)
    @NoEnglish
    public static final Block EXTRAS_MONITOR_BLOCK = new ExtrasMonitorBlock(FabricBlockSettings.create().nonOpaque().requiresTool()
            .instrument(Instrument.COW_BELL).strength(1.5F, 6.0F).pistonBehavior(PistonBehavior.DESTROY));

    @PickaxeMineable(tool = PickaxeMineable.Tool.IRON)
    public static final Block EXTRAS_SCREEN_MONITOR_BLOCK = new ExtrasScreenMonitorBlock(FabricBlockSettings.create().nonOpaque().requiresTool()
            .instrument(Instrument.COW_BELL).strength(1.5F, 6.0F).pistonBehavior(PistonBehavior.DESTROY));


    static {

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.addAfter(Items.WARPED_HANGING_SIGN, EXTRAS_MONITOR_BLOCK);
            entries.addAfter(EXTRAS_MONITOR_BLOCK, EXTRAS_SCREEN_MONITOR_BLOCK);
        });
    }
};
