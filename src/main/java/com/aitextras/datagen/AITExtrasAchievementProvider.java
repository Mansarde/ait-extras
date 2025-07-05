package com.aitextras.datagen;

import com.aitextras.AITExtras;
import com.aitextras.core.AITExtrasBlocks;
import com.aitextras.core.AITExtrasItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class AITExtrasAchievementProvider extends FabricAdvancementProvider {
    public AITExtrasAchievementProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateAdvancement(Consumer<Advancement> consumer) {
        Advancement root = Advancement.Builder.create()
                .display(AITExtrasItems.RECALL_DISC,
                        Text.translatable("achievement.ait-extras.title.root"),
                        Text.translatable("achievement.ait-extras.description.root"),
                        new Identifier("ait-extras", "textures/block/crystalline_shard_block.png"),
                        AdvancementFrame.TASK, false, false, false)
                .criterion("root", InventoryChangedCriterion.Conditions.items(AITExtrasItems.JELLY_BABIES))
                .build(consumer, AITExtras.MOD_ID + "/root");

        Advancement jellyBabies = Advancement.Builder.create().parent(root)
                .display(AITExtrasItems.JELLY_BABIES,
                        Text.translatable("achievement.ait-extras.title.obtain_jelly_babies"),
                        Text.translatable("achievement.ait-extras.description.obtain_jelly_babies"),
                        null, AdvancementFrame.GOAL, true, true, true)
                .criterion("obtain_jelly_babies", InventoryChangedCriterion.Conditions.items(AITExtrasItems.JELLY_BABIES))
                .build(consumer, AITExtras.MOD_ID + "/obtain_jelly_babies");

        Advancement custardCream = Advancement.Builder.create().parent(jellyBabies)
                .display(AITExtrasItems.CUSTARD_CREAM,
                        Text.translatable("achievement.ait-extras.title.obtain_custard_cream"),
                        Text.translatable("achievement.ait-extras.description.obtain_custard_cream"),
                        null, AdvancementFrame.GOAL, true, true, true)
                .criterion("obtain_custard_cream", InventoryChangedCriterion.Conditions.items(AITExtrasItems.CUSTARD_CREAM))
                .build(consumer, AITExtras.MOD_ID + "/obtain_custard_cream");

        Advancement extrasMonitorBlock = Advancement.Builder.create().parent(root)
                .display(AITExtrasBlocks.EXTRAS_MONITOR_BLOCK,
                        Text.translatable("achievement.ait-extras.title.obtain_extras_monitor_block"),
                        Text.translatable("achievement.ait-extras.description.obtain_extras_monitor_block"),
                        null, AdvancementFrame.CHALLENGE, true, true, true)
                .criterion("obtain_extras_monitor_block", InventoryChangedCriterion.Conditions.items(AITExtrasBlocks.EXTRAS_MONITOR_BLOCK))
                .build(consumer, AITExtras.MOD_ID + "/obtain_extras_monitor_block");
    }
}