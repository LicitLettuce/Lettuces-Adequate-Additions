package net.lettuce.adequateadditions.registry;

import net.lettuce.adequateadditions.core.AdequateAdditions;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AdequateAdditions.MOD_ID);

    //rose gold items
    public static final RegistryObject<Item> ROSE_GOLD_INGOT = ITEMS.register
            ("rose_gold_ingot", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_NUGGET = ITEMS.register
            ("rose_gold_nugget", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_BEETROOT = ITEMS.register
            ("rose_gold_beetroot", () -> new Item(new Item.Properties().food(ModFoodsProperties.ROSE_GOLD_BEETROOT)));

    public static final RegistryObject<Item> ROSE_POWDER = ITEMS.register
            ("rose_powder", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_SWORD = ITEMS.register("rose_gold_sword", () -> new SwordItem
            (ModToolTiers.ROSE_GOLD, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.ROSE_GOLD,3,-2.4F))));

    public static final RegistryObject<Item> ROSE_GOLD_PICKAXE = ITEMS.register("rose_gold_pickaxe", () -> new PickaxeItem
            (ModToolTiers.ROSE_GOLD, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.ROSE_GOLD, 1, -2.8F))));

    public static final RegistryObject<Item> ROSE_GOLD_AXE = ITEMS.register("rose_gold_axe", () -> new AxeItem
            (ModToolTiers.ROSE_GOLD, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.ROSE_GOLD, 6, -3.1F))));

    public static final RegistryObject<Item> ROSE_GOLD_SHOVEl = ITEMS.register("rose_gold_shovel", () -> new ShovelItem
            (ModToolTiers.ROSE_GOLD, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.ROSE_GOLD, 1.5F, -3.0F))));

    public static final RegistryObject<Item> ROSE_GOLD_HOE= ITEMS.register("rose_gold_hoe", () -> new HoeItem
            (ModToolTiers.ROSE_GOLD, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.ROSE_GOLD, -2, -1.0F))));

    public static final RegistryObject<Item> ROSE_GOLD_HELMET= ITEMS.register("rose_gold_helmet", () -> new ArmorItem
            (ModArmorMaterials.ROSE_GOLD_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(10))));

    public static final RegistryObject<Item> ROSE_GOLD_CHESTPLATE= ITEMS.register("rose_gold_chestplate", () -> new ArmorItem
            (ModArmorMaterials.ROSE_GOLD_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(10))));

    public static final RegistryObject<Item> ROSE_GOLD_LEGGINGS= ITEMS.register("rose_gold_leggings", () -> new ArmorItem
            (ModArmorMaterials.ROSE_GOLD_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(10))));

    public static final RegistryObject<Item> ROSE_GOLD_BOOTS= ITEMS.register("rose_gold_boots", () -> new ArmorItem
            (ModArmorMaterials.ROSE_GOLD_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(10))));


    public static final RegistryObject<BlockItem> ROSE_GOLD_BLOCK = ITEMS.register("rose_gold_block", () -> new BlockItem(ModBlocks.ROSE_GOLD_BLOCK.get(), new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
