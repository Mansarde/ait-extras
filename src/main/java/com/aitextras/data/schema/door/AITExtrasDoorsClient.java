package com.aitextras.data.schema.door;

import com.aitextras.data.schema.door.ecto.ClientEctoDoorVariant;
import dev.amble.ait.data.schema.door.ClientDoorSchema;
import dev.amble.ait.registry.impl.door.ClientDoorRegistry;

public class AITExtrasDoorsClient {
    public static void init() {
        register(new ClientEctoDoorVariant());
    }
    public static void register(ClientDoorSchema schema) {
        ClientDoorRegistry.register(schema);
    }
}