package com.aitextras.client;

import com.aitextras.data.schema.exterior.AITExtrasExteriors;
import com.aitextras.data.schema.exterior.AITExtrasExteriorsClient;
import net.fabricmc.api.ClientModInitializer;

public class    AITExtrasClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        AITExtrasExteriorsClient.init();
    }
}
