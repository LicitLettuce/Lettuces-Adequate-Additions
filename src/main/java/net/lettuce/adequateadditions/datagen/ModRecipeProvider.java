package net.lettuce.adequateadditions.datagen;

import net.lettuce.adequateadditions.AdequateAdditions;
import net.lettuce.adequateadditions.block.ModBlocks;
import net.lettuce.adequateadditions.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {


        //rose gold recipes

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ROSE_GOLD_INGOT.get(), 2)
                .requires(Items.GOLD_INGOT)
                .requires(Items.GOLD_INGOT)
                .requires(Items.GOLD_INGOT)
                .requires(Items.GOLD_INGOT)
                .requires(Items.COPPER_INGOT)
                .requires(Items.COPPER_INGOT)
                .requires(Items.COPPER_INGOT)
                .requires(Items.COPPER_INGOT)
                .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                .save(pRecipeOutput);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ROSE_GOLD_NUGGET.get(), 9)
                .requires(ModItems.ROSE_GOLD_INGOT.get())
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT.get()), has(ModItems.ROSE_GOLD_INGOT.get()))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ROSE_GOLD_INGOT.get(), 9)
                .requires(ModBlocks.ROSE_GOLD_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.ROSE_GOLD_BLOCK.get()), has(ModBlocks.ROSE_GOLD_BLOCK.get()))
                .save(pRecipeOutput, AdequateAdditions.MOD_ID + "rose_gold_ingot_from_rose_gold_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ROSE_GOLD_INGOT.get(), 1)
                .requires(ModItems.ROSE_GOLD_NUGGET.get())
                .requires(ModItems.ROSE_GOLD_NUGGET.get())
                .requires(ModItems.ROSE_GOLD_NUGGET.get())
                .requires(ModItems.ROSE_GOLD_NUGGET.get())
                .requires(ModItems.ROSE_GOLD_NUGGET.get())
                .requires(ModItems.ROSE_GOLD_NUGGET.get())
                .requires(ModItems.ROSE_GOLD_NUGGET.get())
                .requires(ModItems.ROSE_GOLD_NUGGET.get())
                .requires(ModItems.ROSE_GOLD_NUGGET.get())
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_NUGGET.get()), has(ModItems.ROSE_GOLD_NUGGET.get()))
                .save(pRecipeOutput, AdequateAdditions.MOD_ID + "rose_gold_ingot_from_rose_gold_nugget");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.ROSE_GOLD_BLOCK.get(), 1)
                .requires(ModItems.ROSE_GOLD_INGOT.get())
                .requires(ModItems.ROSE_GOLD_INGOT.get())
                .requires(ModItems.ROSE_GOLD_INGOT.get())
                .requires(ModItems.ROSE_GOLD_INGOT.get())
                .requires(ModItems.ROSE_GOLD_INGOT.get())
                .requires(ModItems.ROSE_GOLD_INGOT.get())
                .requires(ModItems.ROSE_GOLD_INGOT.get())
                .requires(ModItems.ROSE_GOLD_INGOT.get())
                .requires(ModItems.ROSE_GOLD_INGOT.get())
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT.get()), has(ModItems.ROSE_GOLD_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSE_GOLD_BEETROOT.get())
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('#', ModItems.ROSE_GOLD_NUGGET.get())
                .define('X', Items.BEETROOT)
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_NUGGET.get()), has(ModItems.ROSE_GOLD_NUGGET.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSE_POWDER.get())
                .pattern("#  ")
                .pattern("X0 ")
                .define('#', ModItems.ROSE_GOLD_NUGGET.get())
                .define('X', Items.BLAZE_POWDER)
                .define('0', Items.GUNPOWDER)
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_NUGGET.get()), has(ModItems.ROSE_GOLD_NUGGET.get())).save(pRecipeOutput);




    }
}
