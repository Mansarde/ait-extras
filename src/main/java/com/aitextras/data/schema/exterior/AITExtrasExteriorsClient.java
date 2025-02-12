package com.aitextras.data.schema.exterior;

import com.aitextras.data.schema.exterior.variant.ecto.client.ClientEctoExteriorVariant;
import dev.amble.ait.data.schema.exterior.ClientExteriorVariantSchema;
import dev.amble.ait.registry.impl.exterior.ClientExteriorVariantRegistry;

public class AITExtrasExteriorsClient {
    public static void init() {
       register(new ClientEctoExteriorVariant("ecto_default"));
    }

    public static void register(ClientExteriorVariantSchema schema) {
      ClientExteriorVariantRegistry.getInstance().register(schema);
    }
}
