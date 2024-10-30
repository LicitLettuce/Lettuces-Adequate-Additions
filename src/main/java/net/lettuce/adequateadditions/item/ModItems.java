package net.lettuce.adequateadditions.item;

import net.lettuce.adequateadditions.AdequateAdditions;
import net.lettuce.adequateadditions.block.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AdequateAdditions.MOD_ID);

    public static final RegistryObject<Item> ROSE_GOLD_INGOT = ITEMS.register
            ("rose_gold_ingot", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_NUGGET = ITEMS.register
            ("rose_gold_nugget", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_BEETROOT = ITEMS.register
            ("rose_gold_beetroot", () -> new Item(new Item.Properties().food(ModFoodsProperties.ROSE_GOLD_BEETROOT)));

    public static final RegistryObject<Item> ROSE_POWDER = ITEMS.register
            ("rose_powder", () -> new Item(new Item.Properties()));

    public static final RegistryObject<BlockItem> ROSE_GOLD_BLOCK = ITEMS.register("rose_gold_block", () -> new BlockItem(ModBlocks.ROSE_GOLD_BLOCK.get(), new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
