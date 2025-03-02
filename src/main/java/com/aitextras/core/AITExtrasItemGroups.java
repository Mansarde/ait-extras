package com.aitextras.core;


import com.aitextras.AITExtras;
import dev.amble.lib.container.impl.ItemGroupContainer;
import dev.amble.lib.itemgroup.AItemGroup;
import net.minecraft.item.ItemStack;

import static net.minecraft.item.Items.BOWL;

public final class AITExtrasItemGroups implements ItemGroupContainer {

    public static final AItemGroup MAIN = AItemGroup.builder(AITExtras.id("item_group"))
            .icon(() -> new ItemStack(AITExtrasBlocks.EXTRAS_MONITOR_BLOCK.asItem())).build();
}
