package com.aitextras.data.schema.exterior;

import com.aitextras.data.schema.exterior.variant.ecto.EctoExteriorVariant;
import loqor.ait.api.AITRegistryEvents;
import loqor.ait.data.schema.exterior.ExteriorVariantSchema;
import loqor.ait.registry.impl.exterior.ExteriorVariantRegistry;

import java.util.LinkedList;

public class AITExtrasExteriors {
    private static final LinkedList<ExteriorVariantSchema> EXTERIORS = new LinkedList<>();

    static {
        AITRegistryEvents.EXTERIOR_DEFAULTS.register(() -> {
            ExteriorVariantRegistry registry = ExteriorVariantRegistry.getInstance();
            EXTERIORS.forEach(registry::register);
        });
    }

   public static void init() {
       register(new EctoExteriorVariant("ecto_default"));
    }

    public static void register(ExteriorVariantSchema schema) {
        EXTERIORS.add(schema);
    }
}
