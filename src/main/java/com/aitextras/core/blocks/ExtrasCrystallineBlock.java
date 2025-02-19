package com.aitextras.core.blocks;

import java.util.List;

import org.jetbrains.annotations.Nullable;

import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.BlockView;

public class ExtrasCrystallineBlock extends Block {

    public ExtrasCrystallineBlock(Settings settings) {
        super(settings);

    }



    @Override
    public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {
        super.appendTooltip(stack, world, tooltip, options);
        tooltip.add(Text.literal("TEMPORARILY IN AITEXTRAS!").formatted(Formatting.RED));

    }

}