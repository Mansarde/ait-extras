package com.aitextras.client;

import com.aitextras.AITExtras;
import com.aitextras.client.models.doors.EctoDoorModel;
import com.aitextras.client.models.doors.PostBoxDoorModel;
import com.aitextras.client.models.doors.VanillaDoorModel;
import com.aitextras.client.models.exteriors.EctoExteriorModel;
import com.aitextras.client.models.exteriors.PostBoxExteriorModel;
import com.aitextras.client.models.exteriors.VanillaExteriorModel;
import com.aitextras.client.renderers.monitors.ExtrasMonitorRenderer;
import com.aitextras.client.renderers.monitors.ExtrasScreenMonitorRenderer;
import com.aitextras.core.AITExtrasBlockEntityTypes;
import dev.amble.ait.client.models.doors.CapsuleDoorModel;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.util.math.Vec3d;
import org.joml.Vector3f;

import static com.aitextras.AITExtras.POSTBOX;
import static com.aitextras.AITExtras.VANILLA;

public class AITExtrasClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        registerClientAddonExteriors();
        blockEntityRendererRegister();
    }

    private void registerClientAddonExteriors() {
        AITExtras.ECTO.setModel(new EctoExteriorModel()).toClient().register();
        AITExtras.ECTO.toDoor().setModel(new EctoDoorModel(EctoDoorModel.getTexturedModelData().createModel())).toClient().register();

        POSTBOX.setModel(new PostBoxExteriorModel()).toClient().register();
        POSTBOX.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));
        POSTBOX.setPortalWidth(0.9f);
        POSTBOX.setPortalHeight(2f);
        POSTBOX.toDoor().setModel(new PostBoxDoorModel(PostBoxDoorModel.getTexturedModelData().createModel())).toClient().register();

        VANILLA.setModel(new VanillaExteriorModel()).toClient().register();
        VANILLA.setSonicItemTranslations(new Vector3f(0.7f, 1f, 2f));
        VANILLA.setPortalWidth(1f);
        VANILLA.setPortalHeight(2.5f);
        VANILLA.toDoor().setModel(new VanillaDoorModel(VanillaDoorModel.getTexturedModelData().createModel())).toClient().register();
    };
    public static void blockEntityRendererRegister() {

        BlockEntityRendererFactories.register(AITExtrasBlockEntityTypes.EXTRAS_MONITOR_BLOCK_ENTITY_TYPE, ExtrasMonitorRenderer::new);
        BlockEntityRendererFactories.register(AITExtrasBlockEntityTypes.EXTRAS_SCREEN_MONITOR_BLOCK_ENTITY_TYPE, ExtrasScreenMonitorRenderer::new);
    }
}
