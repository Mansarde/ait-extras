package com.aitextras.core;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class AITExtrasFoodComponenets {


    public static final FoodComponent JELLY_BABIES = new FoodComponent.Builder()
            .hunger(2)
            .saturationModifier(0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200, 0), 1.0f)
            .snack()
            .alwaysEdible()
            .build();

    public static final FoodComponent CUSTARD_CREAM = new FoodComponent.Builder()
            .hunger(2)
            .saturationModifier(0.2f)
            .snack()
            .alwaysEdible()
            .build();

    public static final FoodComponent RICE_PUDDING = new FoodComponent.Builder()
            .hunger(4)
            .saturationModifier(0.3f)
            .build();

}
