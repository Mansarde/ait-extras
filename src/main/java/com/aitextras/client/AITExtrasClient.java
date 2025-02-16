package com.aitextras.client;

import com.aitextras.AITExtras;
import com.aitextras.client.models.doors.EctoDoorModel;
import com.aitextras.client.models.exteriors.EctoExteriorModel;
import com.aitextras.client.renderers.monitors.ExtrasMonitorRenderer;
import com.aitextras.core.AITExtrasBlockEntityTypes;
import dev.amble.ait.client.renderers.monitors.MonitorRenderer;
import dev.amble.ait.core.AITBlockEntityTypes;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

public class AITExtrasClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        registerClientAddonExteriors();
        blockEntityRendererRegister();
    }

    private void registerClientAddonExteriors() {
        AITExtras.ECTO.setModel(new EctoExteriorModel()).toClient().register();
        AITExtras.ECTO.toDoor().setModel(new EctoDoorModel(EctoDoorModel.getTexturedModelData().createModel())).toClient().register();
    };
    public static void blockEntityRendererRegister() {

        BlockEntityRendererFactories.register(AITExtrasBlockEntityTypes.EXTRAS_MONITOR_BLOCK_ENTITY_TYPE, ExtrasMonitorRenderer::new);
    }
}
