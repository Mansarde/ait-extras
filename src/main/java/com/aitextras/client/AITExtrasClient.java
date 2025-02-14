package com.aitextras.client;

import com.aitextras.AITExtras;
import com.aitextras.client.models.doors.EctoDoorModel;
import com.aitextras.client.models.exteriors.EctoExteriorModel;
import net.fabricmc.api.ClientModInitializer;

public class AITExtrasClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        registerClientAddonExteriors();
    }

    private void registerClientAddonExteriors() {
        AITExtras.ECTO.setModel(new EctoExteriorModel()).toClient().register();
        AITExtras.ECTO.toDoor().setModel(new EctoDoorModel(EctoDoorModel.getTexturedModelData().createModel())).toClient().register();
    }
}
