package com.aitextras.data.schema.exterior.variant.ecto.client;

import com.aitextras.AITExtras;
import dev.amble.ait.client.models.exteriors.ExteriorModel;
import dev.amble.ait.data.datapack.exterior.BiomeOverrides;
import dev.amble.ait.data.schema.exterior.ClientExteriorVariantSchema;
import com.aitextras.client.models.exteriors.EctoExteriorModel;
import net.minecraft.util.Identifier;
import org.joml.Vector3f;

public class ClientEctoExteriorVariant extends ClientExteriorVariantSchema {
    protected static final String CATEGORY_PATH = "textures/blockentites/exteriors/ecto";
    protected static final Identifier CATEGORY_IDENTIFIER = new Identifier(AITExtras.MOD_ID,
            CATEGORY_PATH + "ecto/ecto_default.png");
    protected static final String TEXTURE_PATH = CATEGORY_PATH + "/";
    protected static final BiomeOverrides OVERRIDES = BiomeOverrides.EMPTY;

    private final String name;

    public ClientEctoExteriorVariant(String name) {
        super(new Identifier(AITExtras.MOD_ID, "blockentites/exteriors/ecto/" + name));

        this.name = name;
    }

    @Override
    public Identifier texture() {
        return new Identifier(AITExtras.MOD_ID, TEXTURE_PATH + name + ".png");
    }

    @Override
    public Identifier emission() {
        return new Identifier(AITExtras.MOD_ID, TEXTURE_PATH + name + "_emission.png");
    }

    @Override
    public ExteriorModel model() {
        return new EctoExteriorModel();
    }

    @Override
    public Vector3f sonicItemTranslations() {
        return new Vector3f(0, 0, 0); // todo
    }

    @Override
    public BiomeOverrides overrides() {
        return OVERRIDES;
    }
}