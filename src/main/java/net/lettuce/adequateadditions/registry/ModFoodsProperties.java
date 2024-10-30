package net.lettuce.adequateadditions.registry;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodsProperties {
    public static final FoodProperties ROSE_GOLD_BEETROOT =
            (new FoodProperties.Builder()).nutrition(7).saturationModifier(1.6F).effect(new MobEffectInstance(MobEffects.REGENERATION, 80), 0.30f).build();
}
