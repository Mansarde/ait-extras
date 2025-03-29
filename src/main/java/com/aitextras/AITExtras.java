package com.aitextras;

import com.aitextras.core.*;
import dev.amble.ait.core.AITSounds;
import dev.amble.ait.data.schema.exterior.category.BoothCategory;
import dev.amble.ait.data.schema.exterior.category.PoliceBoxCategory;
import dev.amble.ait.data.schema.exterior.variant.addon.AddonExterior;
import dev.amble.lib.container.RegistryContainer;
import net.fabricmc.api.ModInitializer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import org.joml.Vector3f;


public class AITExtras implements ModInitializer {

    public static final String MOD_ID = "ait-extras";
    public static AddonExterior ECTO;
    public static AddonExterior POSTBOX;
    public static AddonExterior VANILLA;

    public static Identifier id(String path) {
        return new Identifier(MOD_ID, path);
    }

    @Override
    public void onInitialize() {
        registerAddonExteriors();
        RegistryContainer.register(AITExtrasItems.class, MOD_ID);
        RegistryContainer.register(AITExtrasBlocks.class, MOD_ID);
        RegistryContainer.register(AITExtrasBlockEntityTypes.class, MOD_ID);
        RegistryContainer.register(AITExtrasItemGroups.class, MOD_ID);
        AITExtrasSounds.init();
//        Registry.register(Registries.SOUND_EVENT, Identifier.of(MOD_ID, "mercury_nitrogenez"),
//                SoundEvent.of(Identifier.of(MOD_ID, "mercury_nitrogenez")));
    }

    private void registerAddonExteriors() {
        ECTO = new AddonExterior(PoliceBoxCategory.REFERENCE, MOD_ID, "ecto").register();
        ECTO.setDoor(new AddonExterior.Door(
                        ECTO, true, AITSounds.POLICE_BOX_DOOR_OPEN, AITSounds.POLICE_BOX_DOOR_CLOSE))
                .toDoor().register();

        POSTBOX = new AddonExterior(BoothCategory.REFERENCE, MOD_ID, "post_box").register();
        //POSTBOX.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));
        POSTBOX.setDoor(new AddonExterior.Door(
                        POSTBOX, false, net.minecraft.sound.SoundEvents.BLOCK_WOODEN_TRAPDOOR_OPEN,
                        net.minecraft.sound.SoundEvents.BLOCK_WOODEN_TRAPDOOR_CLOSE))
                .toDoor().register();

        VANILLA = new AddonExterior(PoliceBoxCategory.REFERENCE, MOD_ID, "vanilla").register();
        //VANILLA.setSonicItemTranslations(new Vector3f(0.7f, 1f, 2f));
        VANILLA.setDoor(new AddonExterior.Door(
                        VANILLA, false, SoundEvents.BLOCK_IRON_DOOR_OPEN,
                        net.minecraft.sound.SoundEvents.BLOCK_IRON_DOOR_CLOSE))
                .toDoor().register();

    }


}
