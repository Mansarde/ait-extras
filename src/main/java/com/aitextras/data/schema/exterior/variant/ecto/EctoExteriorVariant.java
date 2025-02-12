package com.aitextras.data.schema.exterior.variant.ecto;

import com.aitextras.AITExtras;
import com.aitextras.data.schema.door.ecto.EctoDoorVariant;
import dev.amble.ait.core.blockentities.ExteriorBlockEntity;
import dev.amble.ait.core.tardis.animation.ExteriorAnimation;
import dev.amble.ait.core.tardis.animation.PulsatingAnimation;
import dev.amble.ait.data.Loyalty;
import dev.amble.ait.data.schema.door.DoorSchema;
import dev.amble.ait.data.schema.exterior.ExteriorVariantSchema;
import dev.amble.ait.data.schema.exterior.category.AdaptiveCategory;
import dev.amble.ait.registry.impl.door.DoorRegistry;
import net.minecraft.util.Identifier;

public class EctoExteriorVariant extends ExteriorVariantSchema {

    public EctoExteriorVariant(String name) {
        super(AdaptiveCategory.REFERENCE, new Identifier(AITExtras.MOD_ID, "blockentites/exteriors/ecto/" + name),
                new Loyalty(Loyalty.Type.OWNER));
    }
    @Override
    public ExteriorAnimation animation(ExteriorBlockEntity be) {
        return new PulsatingAnimation(be);
    }
    @Override
    public DoorSchema door() {
        return DoorRegistry.REGISTRY.get(EctoDoorVariant.REFERENCE); // Ensure you have this door variant class
    }
}