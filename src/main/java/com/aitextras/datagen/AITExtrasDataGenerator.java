package com.aitextras.datagen;

import dev.pavatus.lib.datagen.lang.LanguageType;
import dev.pavatus.lib.datagen.lang.SakitusLanguageProvider;
import dev.pavatus.lib.datagen.loot.SakitusBlockLootTable;
import dev.pavatus.lib.datagen.model.SakitusModelProvider;
import dev.pavatus.lib.datagen.sound.SakitusSoundProvider;
import dev.pavatus.lib.datagen.tag.SakitusBlockTagProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class AITExtrasDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator gen) {
        FabricDataGenerator.Pack pack = gen.createPack();

        genLang(pack);
        //genSounds(pack);
        //genTags(pack);
        //genLoot(pack);
        //genModels(pack);
    }

    //private void genModels(FabricDataGenerator.Pack pack) {
        //pack.addProvider((((output, registriesFuture) -> {
            //SakitusModelProvider provider = new SakitusModelProvider(output);

            //provider.withBlocks(AITExtrasBlocks.class);
            //provider.withItems(AITExtrasItems.class);

            //return provider;
        //})));
    //}
    //private void genTags(FabricDataGenerator.Pack pack) {
       // pack.addProvider((((output, registriesFuture) -> new SakitusBlockTagProvider(output, registriesFuture).withBlocks(AITExtrasBlocks.class))));
   // }
   // private void genLoot(FabricDataGenerator.Pack pack) {
    //   pack.addProvider((((output, registriesFuture) -> new SakitusBlockLootTable(output).withBlocks(AITExtrasBlocks.class))));
    //}

    private void genLang(FabricDataGenerator.Pack pack) {
        genEnglish(pack);
    }

    private void genEnglish(FabricDataGenerator.Pack pack) {
        pack.addProvider((((output, registriesFuture) -> {
                    SakitusLanguageProvider provider = new SakitusLanguageProvider(output, LanguageType.EN_US);

                    //desktops
                    provider.addTranslation("desktop.ait-extras.axos", "Axos");
                    provider.addTranslation("desktop.ait-extras.cherryblossom", "CherryBlossom");
                    provider.addTranslation("desktop.ait-extras.definitive", "Definitive");
                    provider.addTranslation("desktop.ait-extras.exile", "Exile");
                    provider.addTranslation("desktop.ait-extras.industrial", "Industrial");
                    provider.addTranslation("desktop.ait-extras.tron", "Tron");
                    provider.addTranslation("desktop.ait-extras.war_games", "War Games");
                    provider.addTranslation("desktop.ait-extras.academic", "Academic");
                    provider.addTranslation("desktop.ait-extras.modern_victorian", "Modern Victorian");
                    provider.addTranslation("desktop.ait-extras.rebel", "Rebel");
                    provider.addTranslation("desktop.ait-extras.undercroft", "Undercroft");
                    provider.addTranslation("desktop.ait-extras.tardim", "Tardim");
                    provider.addTranslation("desktop.ait-extras.type_85", "Type 85");
                    provider.addTranslation("desktop.ait-extras.type_89", "Type 89");

                    //exteriors

                        //bookshelf
                    provider.addTranslation("exterior.ait-extras.bookshelf_birch", "Birch");
                    provider.addTranslation("exterior.ait-extras.bookshelf_cherry", "Cherry");
                    provider.addTranslation("exterior.ait-extras.bookshelf_dark_oak", "Dark Oak");
                    provider.addTranslation("exterior.ait-extras.bookshelf_jungle", "Jungle");
                    provider.addTranslation("exterior.ait-extras.bookshelf_mangrove", "Mangrove");
                    provider.addTranslation("exterior.ait-extras.bookshelf_oak", "Oak");
                    provider.addTranslation("exterior.ait-extras.bookshelf_spruce", "Spruce");

                        //modern box
                    provider.addTranslation("exterior.ait-extras.aperture_science", "Aperture");
                    provider.addTranslation("exterior.ait-extras.black_mesa", "Mesa");
                    provider.addTranslation("exterior.ait-extras.copper", "Copper");
                    provider.addTranslation("exterior.ait-extras.eleven_toyota", "Copper Toyota");
                    provider.addTranslation("exterior.ait-extras.eleven_toyota_alternate", "Copper Toyota (ALT)");
                    provider.addTranslation("exterior.ait-extras.coral_alternate", "Coral (ALT)");
                    provider.addTranslation("exterior.ait-extras.tokamak_eotd", "Tokamak (EOTD)");
                    provider.addTranslation("exterior.ait-extras.toyota_alternate", "Toyota (ALT)");
                    provider.addTranslation("exterior.ait-extras.toyota_memorial", "Memorial");
                    provider.addTranslation("exterior.ait-extras.yard", "73 Yards");

                        //classic box
                    provider.addTranslation("exterior.ait-extras.tango", "Tango");
                    provider.addTranslation("exterior.ait-extras.classic_cricketer", "Cricketer");
                    provider.addTranslation("exterior.ait-extras.classic_cricketer2", "Cricketer (ALT)");
                    provider.addTranslation("exterior.ait-extras.classic_happiness", "Happiness");
                    provider.addTranslation("exterior.ait-extras.classic_pilot", "Pilot");
                    provider.addTranslation("exterior.ait-extras.classic_percedent", "Percedent");
                    provider.addTranslation("exterior.ait-extras.classic_snowman", "Snowman");
                    provider.addTranslation("exterior.ait-extras.classic_victorian", "Victorian");
                    provider.addTranslation("exterior.ait-extras.classic_wanderlust", "Wanderlust");

                        //booth
                    provider.addTranslation("exterior.ait-extras.tinylink", "Tiny Link");


                    //sonics
                    provider.addTranslation("sonic.ait-extras.cane", "Cane");
                    provider.addTranslation("sonic.ait-extras.fob_pink", "Fob (Pink)");
                    provider.addTranslation("sonic.ait-extras.fob_red", "Fob (Red)");
                    provider.addTranslation("sonic.ait-extras.fob_yellow", "Fob (Yellow)");


            //provider.translateBlocks(AITExtrasBlocks.class);

            //provider.translateItems(AITExtrasItems.class);


            return provider;
        })));
    }

   // private void genSounds(FabricDataGenerator.Pack pack) {
       // pack.addProvider((((output, registriesFuture) -> {
           // SakitusSoundProvider provider = new SakitusSoundProvider(output);

           // return provider;
       // })));
   // }
}