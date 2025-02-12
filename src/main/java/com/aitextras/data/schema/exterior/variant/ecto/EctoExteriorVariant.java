package com.aitextras.data.schema.exterior.variant.ecto;

import com.aitextras.AITExtras;
import com.aitextras.data.schema.animation.ecto.EctoAnimation;
import com.aitextras.data.schema.door.ecto.EctoDoorVariant;
import loqor.ait.core.blockentities.ExteriorBlockEntity;
import loqor.ait.core.tardis.animation.ExteriorAnimation;
import loqor.ait.data.Loyalty;
import loqor.ait.data.schema.door.DoorSchema;
import loqor.ait.data.schema.exterior.ExteriorVariantSchema;
import loqor.ait.data.schema.exterior.category.AdaptiveCategory;
import loqor.ait.registry.impl.door.DoorRegistry;
import net.minecraft.util.Identifier;

public class EctoExteriorVariant extends ExteriorVariantSchema {

    public EctoExteriorVariant(String name) {
        super(AdaptiveCategory.REFERENCE, new Identifier(AITExtras.MOD_ID, "blockentites/exteriors/ecto/" + name),
                new Loyalty(Loyalty.Type.OWNER));
    }
    @Override
    public ExteriorAnimation animation(ExteriorBlockEntity be) {
        return new EctoAnimation(be); // Ensure you have this animation class
    }
    @Override
    public DoorSchema door() {
        return DoorRegistry.REGISTRY.get(EctoDoorVariant.REFERENCE); // Ensure you have this door variant class
    }
}