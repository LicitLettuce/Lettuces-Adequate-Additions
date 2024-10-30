package net.lettuce.adequateadditions.registry;

import net.lettuce.adequateadditions.core.AdequateAdditions;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import javax.swing.text.html.HTML;

public class ModTags {
    public static class Blocks {

        public static final TagKey<Block> NEEDS_ROSE_GOLD_TOOL = createTag("needs_rose_gold_tool");
        public static final TagKey<Block> INCORRECT_FOR_ROSE_GOLD_TOOL = createTag("incorrect_rose_gold_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(AdequateAdditions.MOD_ID, name));
        }

        public static class Items {
            public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");

            private static TagKey<Item> createTag(String name) {
                return ItemTags.create(ResourceLocation.fromNamespaceAndPath(AdequateAdditions.MOD_ID, name));
            }
        }
    }
}