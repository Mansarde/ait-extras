package com.aitextras.client;

import com.aitextras.AITExtras;
import com.aitextras.client.models.doors.*;
import com.aitextras.client.models.exteriors.*;
import com.aitextras.client.renderers.decor.*;
import com.aitextras.client.renderers.monitors.ExtrasMonitorRenderer;
import com.aitextras.client.renderers.monitors.ExtrasScreenMonitorRenderer;
import com.aitextras.core.AITExtrasBlockEntityTypes;
import dev.amble.ait.client.models.doors.CapsuleDoorModel;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.util.math.Vec3d;
import org.joml.Vector3f;

import static com.aitextras.AITExtras.*;

public class AITExtrasClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        registerClientAddonExteriors();
        blockEntityRendererRegister();
    }

    private void registerClientAddonExteriors() {
        ECTO.setModel(new EctoExteriorModel()).toClient().register();
        ECTO.setPortalWidth(1.15f);
        ECTO.setPortalHeight(2.28f);
        ECTO.toDoor().setModel(new EctoDoorModel(EctoDoorModel.getTexturedModelData().createModel())).toClient().register();

        POSTBOX.setModel(new PostBoxExteriorModel()).toClient().register();
        POSTBOX.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));
        POSTBOX.setPortalWidth(0.9f);
        POSTBOX.setPortalHeight(2f);
        POSTBOX.toDoor().setModel(new PostBoxDoorModel(PostBoxDoorModel.getTexturedModelData().createModel())).toClient().register();

        VANILLA.setModel(new VanillaExteriorModel()).toClient().register();
        VANILLA.setSonicItemTranslations(new Vector3f(0.7f, 1f, 3f));
        VANILLA.setPortalWidth(1f);
        VANILLA.setPortalHeight(2.5f);
        VANILLA.toDoor().setModel(new VanillaDoorModel(VanillaDoorModel.getTexturedModelData().createModel())).toClient().register();
//        VANILLA.toClient().hasTransparentDoors();

        CLOCK.setModel(new ClockExteriorModel<>()).toClient().register();
        CLOCK.setSonicItemTranslations(new Vector3f(0.7f, 1f, 2f));
        CLOCK.setPortalWidth(1f);
        CLOCK.setPortalHeight(2f);
        CLOCK.toDoor().setModel(new ClockDoorModel(ClockDoorModel.getTexturedModelData().createModel())).toClient().register();

        ORIGIN.setModel(new OriginExteriorModel()).toClient().register();
        ORIGIN.setSonicItemTranslations(new Vector3f(0.7f, 1f, 2f));
        ORIGIN.setPortalWidth(1f);
        ORIGIN.setPortalHeight(2f);
        ORIGIN.toDoor().setModel(new OriginDoorModel(OriginDoorModel.getTexturedModelData().createModel())).toClient().register();

//        BOX.setModel(new BoxExteriorModel()).toClient().register();
//        BOX.setPortalWidth(1.15f);
//        BOX.setPortalHeight(2.28f);
//        BOX.toDoor().setModel(new BoxDoorModel(BoxDoorModel.getTexturedModelData().createModel())).toClient().register();
    };
    public static void blockEntityRendererRegister() {
        BlockEntityRendererFactories.register(AITExtrasBlockEntityTypes.EXTRAS_MONITOR_BLOCK_ENTITY_TYPE, ExtrasMonitorRenderer::new);
        BlockEntityRendererFactories.register(AITExtrasBlockEntityTypes.EXTRAS_SCREEN_MONITOR_BLOCK_ENTITY_TYPE, ExtrasScreenMonitorRenderer::new);
        BlockEntityRendererFactories.register(AITExtrasBlockEntityTypes.SUN_DIAL_BLOCK_ENTITY_TYPE, SunDialRenderer::new);
        BlockEntityRendererFactories.register(AITExtrasBlockEntityTypes.HAT_STAND_OAK_BLOCK_ENTITY_TYPE, HatStandOakRenderer::new);
        BlockEntityRendererFactories.register(AITExtrasBlockEntityTypes.HAT_STAND_ACACIA_BLOCK_ENTITY_TYPE, HatStandAcaciaRenderer::new);
        BlockEntityRendererFactories.register(AITExtrasBlockEntityTypes.HAT_STAND_BAMBOO_BLOCK_ENTITY_TYPE, HatStandBambooRenderer::new);
        BlockEntityRendererFactories.register(AITExtrasBlockEntityTypes.HAT_STAND_BIRCH_BLOCK_ENTITY_TYPE, HatStandBirchRenderer::new);
        BlockEntityRendererFactories.register(AITExtrasBlockEntityTypes.HAT_STAND_CHERRY_BLOCK_ENTITY_TYPE, HatStandCherryRenderer::new);
        BlockEntityRendererFactories.register(AITExtrasBlockEntityTypes.HAT_STAND_CRIMSON_BLOCK_ENTITY_TYPE, HatStandCrimsonRenderer::new);
        BlockEntityRendererFactories.register(AITExtrasBlockEntityTypes.HAT_STAND_DARK_OAK_BLOCK_ENTITY_TYPE, HatStandDarkOakRenderer::new);
        BlockEntityRendererFactories.register(AITExtrasBlockEntityTypes.HAT_STAND_JUNGLE_BLOCK_ENTITY_TYPE, HatStandJungleRenderer::new);
        BlockEntityRendererFactories.register(AITExtrasBlockEntityTypes.HAT_STAND_MANGROVE_BLOCK_ENTITY_TYPE, HatStandMangroveRenderer::new);
        BlockEntityRendererFactories.register(AITExtrasBlockEntityTypes.HAT_STAND_SPRUCE_BLOCK_ENTITY_TYPE, HatStandSpruceRenderer::new);
        BlockEntityRendererFactories.register(AITExtrasBlockEntityTypes.HAT_STAND_WARPED_BLOCK_ENTITY_TYPE, HatStandWarpedRenderer::new);
        BlockEntityRendererFactories.register(AITExtrasBlockEntityTypes.CRYSTAL_BLOCK_ENTITY_TYPE, CrystalRenderer::new);
        BlockEntityRendererFactories.register(AITExtrasBlockEntityTypes.CRYSTAL_ZEITON_BLOCK_ENTITY_TYPE, CrystalZeitonRenderer::new);
        BlockEntityRendererFactories.register(AITExtrasBlockEntityTypes.CRYSTAL_MASTER_BLOCK_ENTITY_TYPE, CrystalMasterRenderer::new);
    }
}
