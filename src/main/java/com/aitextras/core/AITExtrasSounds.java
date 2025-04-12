package com.aitextras.core;

import com.aitextras.AITExtras;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

import java.util.List;

public class AITExtrasSounds {

    // Music
    public static final SoundEvent MERCURY_DISC = registerSoundEvent("mercury_disc");

    public static void init() {
        // Initialization logic if needed
    }

    private static SoundEvent register(String name) {
        return register(AITExtras.id(name));
    }

    private static SoundEvent register(Identifier id) {
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static List<SoundEvent> getSounds(String modid) {
        return Registries.SOUND_EVENT.stream()
                .filter(sound -> sound.getId().getNamespace().equals(modid))
                .toList();
    }

    private static SoundEvent registerSoundEvent(String name) {
        return register(name);
    }
}