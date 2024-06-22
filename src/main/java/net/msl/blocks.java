package net.msl;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.Map;

public class blocks {

    public static Map<String, Object> createBlockWithItem(Block block, Item item, Identifier identifier) {
        Map<String, Object> result = new HashMap<>();
        result.put("block", Registry.register(Registries.BLOCK, identifier, block));
        result.put("item", Registry.register(Registries.ITEM, identifier, item));
        return result;
    }

    public static Block createBlockNoItem(Block block, Identifier identifier) {
        Block result = Registry.register(Registries.BLOCK, identifier, block);
        return result;
    }

}
