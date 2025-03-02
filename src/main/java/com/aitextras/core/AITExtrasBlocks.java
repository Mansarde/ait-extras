package com.aitextras.core;

import com.aitextras.core.blocks.ExtrasCrystallineBlock;
import com.aitextras.core.blocks.ExtrasMonitorBlock;
import com.aitextras.core.blocks.ExtrasRoundelBlock;
import com.aitextras.core.blocks.ExtrasScreenMonitorBlock;
import dev.amble.lib.block.ABlockSettings;
import dev.amble.lib.container.impl.BlockContainer;
import dev.amble.lib.datagen.util.AutomaticModel;
import dev.amble.lib.datagen.util.NoEnglish;
import dev.amble.lib.datagen.util.PickaxeMineable;
import dev.amble.lib.item.AItemSettings;
import net.minecraft.block.Block;
import net.minecraft.block.enums.Instrument;
import net.minecraft.block.piston.PistonBehavior;

public class AITExtrasBlocks extends BlockContainer {

    @PickaxeMineable(tool = PickaxeMineable.Tool.IRON)
    @NoEnglish
    public static final Block EXTRAS_MONITOR_BLOCK = new ExtrasMonitorBlock(ABlockSettings.create()
            .itemSettings(new AItemSettings().group(AITExtrasItemGroups.MAIN)).nonOpaque().requiresTool()
            .instrument(Instrument.COW_BELL).strength(1.5F, 6.0F).pistonBehavior(PistonBehavior.DESTROY));

    @PickaxeMineable(tool = PickaxeMineable.Tool.IRON)
    public static final Block EXTRAS_SCREEN_MONITOR_BLOCK = new ExtrasScreenMonitorBlock(ABlockSettings.create()
            .itemSettings(new AItemSettings().group(AITExtrasItemGroups.MAIN)).nonOpaque().requiresTool()
            .instrument(Instrument.COW_BELL).strength(1.5F, 6.0F).pistonBehavior(PistonBehavior.DESTROY));

    @AutomaticModel
    @NoEnglish
    public static final Block EXTRAS_MINT_ROUNDEL = new ExtrasRoundelBlock(
            ABlockSettings.create().itemSettings(new AItemSettings().group(AITExtrasItemGroups.MAIN)).nonOpaque().strength(0.01F, 0.01F).pistonBehavior(PistonBehavior.NORMAL), "MINT (Version A)");

    @AutomaticModel
    @NoEnglish
    public static final Block EXTRAS_MINT_ROUNDEL_SIDE = new ExtrasRoundelBlock(
            ABlockSettings.create().itemSettings(new AItemSettings().group(AITExtrasItemGroups.MAIN)).nonOpaque().strength(0.01F, 0.01F).pistonBehavior(PistonBehavior.NORMAL), "MINT (Version B)");

    @AutomaticModel
    @NoEnglish
    public static final Block EXTRAS_WHITE_ROUNDEL = new ExtrasRoundelBlock(
            ABlockSettings.create().itemSettings(new AItemSettings().group(AITExtrasItemGroups.MAIN)).nonOpaque().strength(0.01F, 0.01F).pistonBehavior(PistonBehavior.NORMAL), "WHITE (Version A)");

    @AutomaticModel
    @NoEnglish
    public static final Block EXTRAS_WHITE_ROUNDEL_SIDE = new ExtrasRoundelBlock(
            ABlockSettings.create().itemSettings(new AItemSettings().group(AITExtrasItemGroups.MAIN)).nonOpaque().strength(0.01F, 0.01F).pistonBehavior(PistonBehavior.NORMAL), "WHITE (Version B)");

    @AutomaticModel
    @NoEnglish
    public static final Block EXTRAS_RENAISSANCE_ROUNDEL = new ExtrasRoundelBlock(
            ABlockSettings.create().itemSettings(new AItemSettings().group(AITExtrasItemGroups.MAIN)).nonOpaque().strength(0.01F, 0.01F).pistonBehavior(PistonBehavior.NORMAL), "RENAISSANCE (Version A)");

    @AutomaticModel
    @NoEnglish
    public static final Block EXTRAS_RENAISSANCE_ROUNDEL_SIDE = new ExtrasRoundelBlock(
            ABlockSettings.create().itemSettings(new AItemSettings().group(AITExtrasItemGroups.MAIN)).nonOpaque().strength(0.01F, 0.01F).pistonBehavior(PistonBehavior.NORMAL), "RENAISSANCE (Version B)");

    @AutomaticModel
    @NoEnglish
    public static final Block EXTRAS_TARDIM_ROUNDEL = new ExtrasRoundelBlock(
            ABlockSettings.create().itemSettings(new AItemSettings().group(AITExtrasItemGroups.MAIN)).nonOpaque().strength(0.01F, 0.01F).pistonBehavior(PistonBehavior.NORMAL), "TARDIM (Version A)");

    @AutomaticModel
    @NoEnglish
    public static final Block EXTRAS_TARDIM_ROUNDEL_SIDE = new ExtrasRoundelBlock(
            ABlockSettings.create().itemSettings(new AItemSettings().group(AITExtrasItemGroups.MAIN)).nonOpaque().strength(0.01F, 0.01F).pistonBehavior(PistonBehavior.NORMAL), "TARDIM (Version B)");

    @AutomaticModel
    @NoEnglish
    public static final Block EXTRAS_DARK_OAK_ROUNDEL = new ExtrasRoundelBlock(
            ABlockSettings.create().itemSettings(new AItemSettings().group(AITExtrasItemGroups.MAIN)).nonOpaque().strength(0.01F, 0.01F).pistonBehavior(PistonBehavior.NORMAL), "DARK OAK (Version A)");

    @AutomaticModel
    @NoEnglish
    public static final Block EXTRAS_DARK_OAK_ROUNDEL_SIDE = new ExtrasRoundelBlock(
            ABlockSettings.create().itemSettings(new AItemSettings().group(AITExtrasItemGroups.MAIN)).nonOpaque().strength(0.01F, 0.01F).pistonBehavior(PistonBehavior.NORMAL), "DARK OAK (Version B)");

    @AutomaticModel
    @NoEnglish
    public static final Block EXTRAS_CRYSTALLINE_BLOCK = new ExtrasCrystallineBlock(
            ABlockSettings.create().itemSettings(new AItemSettings().group(AITExtrasItemGroups.MAIN)).nonOpaque().strength(0.01F, 0.01F).pistonBehavior(PistonBehavior.NORMAL));

    
   };
