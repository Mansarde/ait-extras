package com.aitextras.datagen;

import java.util.concurrent.CompletableFuture;

import com.aitextras.core.AITExtrasItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.tag.ItemTags;
import org.jetbrains.annotations.Nullable;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;


public class AITExtrasItemTagProvider extends FabricTagProvider<Item> {
    public AITExtrasItemTagProvider(FabricDataOutput output,
                              @Nullable CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, RegistryKeys.ITEM, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        // Items

        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
                .add(AITExtrasItems.MERCURY_DISC
//                        AITExtrasItems.RECALL_DISC
                        );

    }

    @Override
    public FabricTagProvider<Item>.FabricTagBuilder getOrCreateTagBuilder(TagKey<Item> tag) {
        return super.getOrCreateTagBuilder(tag);
    }
}
