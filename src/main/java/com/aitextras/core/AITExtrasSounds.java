package com.aitextras.core;

import com.aitextras.AITExtras;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class AITExtrasSounds {

    // Music
    public static final SoundEvent MERCURY_DISC = register("music/mercury_disc");

    // Register a SoundEvent
    private static SoundEvent register(String name) {
        Identifier id = AITExtras.id(name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    // Initialize all sounds
    public static void init() {
        // This ensures the static fields are loaded and registered
    }
}