package com.aitextras;

import com.aitextras.data.schema.exterior.AITExtrasExteriors;
import com.aitextras.data.schema.exterior.AITExtrasExteriorsClient;
import net.fabricmc.api.ModInitializer;

public class AITExtras implements ModInitializer {

    public static final String MOD_ID = "ait-extras";

    @Override
    public void onInitialize() {
        AITExtrasExteriors.init();
    }
}
