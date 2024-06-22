package net.msl;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class items {

    public static Item createItem(Item item, Identifier identifier) {
        Item result = Registry.register(Registries.ITEM, identifier, item);
        return result;
    }
}
