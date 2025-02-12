package com.aitextras.data.schema.door.ecto;

import com.aitextras.AITExtras;
import loqor.ait.core.AITSounds;
import loqor.ait.data.schema.door.DoorSchema;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;

public class EctoDoorVariant extends DoorSchema {
    public static final Identifier REFERENCE = new Identifier(AITExtras.MOD_ID, "door/ecto");

    public EctoDoorVariant() {
        super(REFERENCE);
    }

    @Override
    public boolean isDouble() {
        return true;
    }

    @Override
    public SoundEvent openSound() {
        return AITSounds.POLICE_BOX_DOOR_OPEN; // Replace with a specific sound for Lego doors if desired
    }

    @Override
    public SoundEvent closeSound() {
        return AITSounds.POLICE_BOX_DOOR_OPEN; // Replace with a specific sound for Lego doors if desired
    }

    @Override
    public Vec3d adjustPortalPos(Vec3d pos, Direction direction) {
        return switch (direction) {
            case DOWN, UP -> pos;
            case NORTH -> pos.add(0.0, 0.1, -0.4);
            case SOUTH -> pos.add(0.0, 0.1, 0.4);
            case WEST -> pos.add(-0.4, 0.1, 0.0);
            case EAST -> pos.add(0.4, 0.1, 0.0);
        };
    }
}