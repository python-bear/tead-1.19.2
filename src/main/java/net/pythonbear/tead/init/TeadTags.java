package net.pythonbear.tead.init;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.pythonbear.tead.Tead;

public class TeadTags {
    public static class Blocks {
        public static final TagKey<Block> REFINED_BUILDING_BLOCKS = createTag("refined_building_blocks");
        private static TagKey<Block> createTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier(Tead.MOD_ID, name));
        }
    }

    public static class Items {
        private static TagKey<Item> createTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier(Tead.MOD_ID, name));
        }
    }
}
