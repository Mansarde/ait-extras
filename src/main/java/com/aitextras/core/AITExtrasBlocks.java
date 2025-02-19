package com.aitextras.core;

import com.aitextras.core.blocks.ExtrasCrystallineBlock;
import com.aitextras.core.blocks.ExtrasMonitorBlock;
import com.aitextras.core.blocks.ExtrasRoundelBlock;
import com.aitextras.core.blocks.ExtrasScreenMonitorBlock;
import dev.amble.lib.container.impl.BlockContainer;
import dev.amble.lib.datagen.util.AutomaticModel;
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

    @AutomaticModel
    @NoEnglish
    public static final Block EXTRAS_MINT_ROUNDEL = new ExtrasRoundelBlock(
            FabricBlockSettings.create().nonOpaque().strength(0.01F, 0.01F).pistonBehavior(PistonBehavior.NORMAL), "MINT (Version A)");

    @AutomaticModel
    @NoEnglish
    public static final Block EXTRAS_MINT_ROUNDEL_SIDE = new ExtrasRoundelBlock(
            FabricBlockSettings.create().nonOpaque().strength(0.01F, 0.01F).pistonBehavior(PistonBehavior.NORMAL), "MINT (Version B)");

    @AutomaticModel
    @NoEnglish
    public static final Block EXTRAS_WHITE_ROUNDEL = new ExtrasRoundelBlock(
            FabricBlockSettings.create().nonOpaque().strength(0.01F, 0.01F).pistonBehavior(PistonBehavior.NORMAL), "WHITE (Version A)");

    @AutomaticModel
    @NoEnglish
    public static final Block EXTRAS_WHITE_ROUNDEL_SIDE = new ExtrasRoundelBlock(
            FabricBlockSettings.create().nonOpaque().strength(0.01F, 0.01F).pistonBehavior(PistonBehavior.NORMAL), "WHITE (Version B)");

    @AutomaticModel
    @NoEnglish
    public static final Block EXTRAS_RENAISSANCE_ROUNDEL = new ExtrasRoundelBlock(
            FabricBlockSettings.create().nonOpaque().strength(0.01F, 0.01F).pistonBehavior(PistonBehavior.NORMAL), "RENAISSANCE (Version A)");

    @AutomaticModel
    @NoEnglish
    public static final Block EXTRAS_RENAISSANCE_ROUNDEL_SIDE = new ExtrasRoundelBlock(
            FabricBlockSettings.create().nonOpaque().strength(0.01F, 0.01F).pistonBehavior(PistonBehavior.NORMAL), "RENAISSANCE (Version B)");

    @AutomaticModel
    @NoEnglish
    public static final Block EXTRAS_TARDIM_ROUNDEL = new ExtrasRoundelBlock(
            FabricBlockSettings.create().nonOpaque().strength(0.01F, 0.01F).pistonBehavior(PistonBehavior.NORMAL), "TARDIM (Version A)");

    @AutomaticModel
    @NoEnglish
    public static final Block EXTRAS_TARDIM_ROUNDEL_SIDE = new ExtrasRoundelBlock(
            FabricBlockSettings.create().nonOpaque().strength(0.01F, 0.01F).pistonBehavior(PistonBehavior.NORMAL), "TARDIM (Version B)");

    @AutomaticModel
    @NoEnglish
    public static final Block EXTRAS_DARK_OAK_ROUNDEL = new ExtrasRoundelBlock(
            FabricBlockSettings.create().nonOpaque().strength(0.01F, 0.01F).pistonBehavior(PistonBehavior.NORMAL), "DARK OAK (Version A)");

    @AutomaticModel
    @NoEnglish
    public static final Block EXTRAS_DARK_OAK_ROUNDEL_SIDE = new ExtrasRoundelBlock(
            FabricBlockSettings.create().nonOpaque().strength(0.01F, 0.01F).pistonBehavior(PistonBehavior.NORMAL), "DARK OAK (Version B)");

    @AutomaticModel
    @NoEnglish
    public static final Block EXTRAS_CRYSTALLINE_BLOCK = new ExtrasCrystallineBlock(
            FabricBlockSettings.create().nonOpaque().strength(0.01F, 0.01F).pistonBehavior(PistonBehavior.NORMAL));



    static {

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.addAfter(Items.WARPED_HANGING_SIGN, EXTRAS_MONITOR_BLOCK);
            entries.addAfter(EXTRAS_MONITOR_BLOCK, EXTRAS_SCREEN_MONITOR_BLOCK);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.addBefore(Items.OAK_LOG, EXTRAS_MINT_ROUNDEL);
            entries.addAfter(EXTRAS_MINT_ROUNDEL, EXTRAS_MINT_ROUNDEL_SIDE);
            entries.addAfter(EXTRAS_MINT_ROUNDEL_SIDE, EXTRAS_WHITE_ROUNDEL);
            entries.addAfter(EXTRAS_WHITE_ROUNDEL, EXTRAS_WHITE_ROUNDEL_SIDE);
            entries.addAfter(EXTRAS_WHITE_ROUNDEL_SIDE, EXTRAS_RENAISSANCE_ROUNDEL);
            entries.addAfter(EXTRAS_RENAISSANCE_ROUNDEL, EXTRAS_RENAISSANCE_ROUNDEL_SIDE);
            entries.addAfter(EXTRAS_RENAISSANCE_ROUNDEL_SIDE, EXTRAS_TARDIM_ROUNDEL);
            entries.addAfter(EXTRAS_TARDIM_ROUNDEL, EXTRAS_TARDIM_ROUNDEL_SIDE);
            entries.addAfter(EXTRAS_TARDIM_ROUNDEL_SIDE, EXTRAS_DARK_OAK_ROUNDEL);
            entries.addAfter(EXTRAS_DARK_OAK_ROUNDEL, EXTRAS_DARK_OAK_ROUNDEL_SIDE);
            entries.addAfter(EXTRAS_DARK_OAK_ROUNDEL_SIDE, EXTRAS_CRYSTALLINE_BLOCK);
        });
    }
};
