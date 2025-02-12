package com.aitextras.data.schema.exterior;

import com.aitextras.data.schema.exterior.variant.ecto.client.ClientEctoExteriorVariant;
import loqor.ait.data.schema.exterior.ClientExteriorVariantSchema;
import loqor.ait.registry.impl.exterior.ClientExteriorVariantRegistry;

public class AITExtrasExteriorsClient {
    public static void init() {
       register(new ClientEctoExteriorVariant("ecto/ecto_default"));
    }

    public static void register(ClientExteriorVariantSchema schema) {
      ClientExteriorVariantRegistry.getInstance().register(schema);
    }
}
