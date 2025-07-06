package com.aitextras.world.gen;

import com.aitextras.world.AITExtrasPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class AITExtrasOreGeneration {
    public static void generateOres() {
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                AITExtrasPlacedFeatures.CRYSTALLINE_ORE_PLACED_KEY
        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                AITExtrasPlacedFeatures.ZIRCONIUM_ORE_PLACED_KEY
        );
    }
}