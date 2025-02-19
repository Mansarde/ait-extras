package com.aitextras.core.blocks;

import java.util.List;

import org.jetbrains.annotations.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;

public class ExtrasRoundelBlock extends Block {
    private final String id;

    public ExtrasRoundelBlock(Settings settings, String RoundelID) {
        super(settings);
        this.id = RoundelID;
    }

    public String RoundelID() {
        return id;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {
        super.appendTooltip(stack, world, tooltip, options);

        tooltip.add(Text.literal(RoundelID()).formatted(Formatting.DARK_GRAY));
        tooltip.add(Text.literal("TEMPORARILY IN AITEXTRAS!").formatted(Formatting.RED));
    }

}