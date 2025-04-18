package com.aitextras.core;

import com.aitextras.core.blocks.ExtrasCrystallineBlock;
import com.aitextras.core.blocks.ExtrasMonitorBlock;
import com.aitextras.core.blocks.ExtrasScreenMonitorBlock;
import com.aitextras.core.blocks.SunDialBlock;
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
    public static final Block EXTRAS_CRYSTALLINE_BLOCK = new ExtrasCrystallineBlock(
            ABlockSettings.create().itemSettings(new AItemSettings().group(AITExtrasItemGroups.MAIN)).nonOpaque().strength(0.01F, 0.01F).pistonBehavior(PistonBehavior.NORMAL));




    @PickaxeMineable(tool = PickaxeMineable.Tool.IRON)
    public static final Block SUN_DIAL_BLOCK = new SunDialBlock(ABlockSettings.create()
            .itemSettings(new AItemSettings().group(AITExtrasItemGroups.MAIN)).nonOpaque().requiresTool()
            .instrument(Instrument.COW_BELL).strength(1.5F, 6.0F).pistonBehavior(PistonBehavior.DESTROY));
    
   };
