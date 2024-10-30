package net.lettuce.adequateadditions.data;

import net.lettuce.adequateadditions.core.AdequateAdditions;
import net.lettuce.adequateadditions.registry.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture,
                              CompletableFuture<TagLookup<Block>> lookupCompletableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, completableFuture, lookupCompletableFuture, AdequateAdditions.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(ItemTags.TRIM_MATERIALS)
                .add(ModItems.ROSE_GOLD_INGOT.get());

        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.ROSE_GOLD_HELMET.get());
        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.ROSE_GOLD_CHESTPLATE.get());
        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.ROSE_GOLD_LEGGINGS.get());
        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.ROSE_GOLD_BOOTS.get());

    }
}
