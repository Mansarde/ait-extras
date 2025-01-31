package com.aitextras.sakitus;

import dev.pavatus.lib.api.SakitusModInitializer;
import dev.pavatus.register.api.RegistryEvents;
import loqor.ait.core.engine.registry.SubSystemRegistry;
import loqor.ait.core.item.blueprint.BlueprintRegistry;
import loqor.ait.core.likes.ItemOpinionRegistry;
import loqor.ait.core.lock.LockedDimensionRegistry;
import loqor.ait.core.sounds.flight.FlightSoundRegistry;
import loqor.ait.core.sounds.travel.TravelSoundRegistry;
import loqor.ait.core.tardis.vortex.reference.VortexReferenceRegistry;
import loqor.ait.registry.impl.*;
import loqor.ait.registry.impl.console.variant.ConsoleVariantRegistry;
import loqor.ait.registry.impl.exterior.ExteriorVariantRegistry;

public class SakitusInitializer implements SakitusModInitializer {
    @Override
    public void onInitializeSakitus() {
        RegistryEvents.INIT.register((registries, isClient) -> {
            if (isClient) return;

        });
    }
}
