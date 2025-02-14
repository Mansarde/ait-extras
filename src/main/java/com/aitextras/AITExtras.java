package com.aitextras;

import dev.amble.ait.core.AITSounds;
import dev.amble.ait.data.schema.exterior.category.PoliceBoxCategory;
import dev.amble.ait.data.schema.exterior.variant.addon.AddonExterior;
import net.fabricmc.api.ModInitializer;

public class AITExtras implements ModInitializer {

    public static final String MOD_ID = "ait-extras";
    public static AddonExterior ECTO;

    @Override
    public void onInitialize() {
        registerAddonExteriors();
    }

    private void registerAddonExteriors() {
        ECTO = new AddonExterior(PoliceBoxCategory.REFERENCE, MOD_ID, "ecto").register();
        ECTO.setDoor(new AddonExterior.Door(
                        ECTO, true, AITSounds.POLICE_BOX_DOOR_OPEN, AITSounds.POLICE_BOX_DOOR_CLOSE))
                .toDoor().register();
    }
}
