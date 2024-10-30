package net.lettuce.adequateadditions.datagen;

import net.lettuce.adequateadditions.AdequateAdditions;
import net.lettuce.adequateadditions.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, AdequateAdditions.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.ROSE_GOLD_INGOT.get());
        basicItem(ModItems.ROSE_GOLD_NUGGET.get());
        basicItem(ModItems.ROSE_POWDER.get());
        basicItem(ModItems.ROSE_GOLD_BEETROOT.get());
    }
}
