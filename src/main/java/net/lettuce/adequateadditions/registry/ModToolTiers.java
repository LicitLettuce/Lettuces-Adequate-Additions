package net.lettuce.adequateadditions.registry;


import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;

public class ModToolTiers{
    public static final Tier ROSE_GOLD = new  ForgeTier(
            792, 10.0F, 5.0F, 20,
            ModTags.Blocks.NEEDS_ROSE_GOLD_TOOL, () -> Ingredient.of(ModItems.ROSE_GOLD_INGOT.get()),
            ModTags.Blocks.INCORRECT_FOR_ROSE_GOLD_TOOL);
}