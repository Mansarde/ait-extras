package com.aitextras.core;


import com.aitextras.core.item.RecallDiscItem;
import dev.amble.ait.core.AITItemGroups;
import dev.amble.ait.core.AITSounds;
import dev.amble.lib.container.impl.ItemContainer;
import dev.amble.lib.datagen.util.AutomaticModel;
import dev.amble.lib.datagen.util.NoEnglish;
import dev.amble.lib.item.AItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.util.Rarity;

public class AITExtrasItems extends ItemContainer {

    @AutomaticModel
    @NoEnglish
    public static final Item MERCURY_DISC = new MusicDiscItem(11, AITExtrasSounds.MERCURY_DISC,
            new AItemSettings().maxCount(1).rarity(Rarity.RARE).group(AITExtrasItemGroups.MAIN), 216);

    @AutomaticModel
    @NoEnglish
    public static final Item RECALL_DISC = new RecallDiscItem(new AItemSettings().group(AITExtrasItemGroups.MAIN).maxCount(1));
}
