package net.adam.pedestalmod.item;

import net.adam.pedestalmod.Pedestalmod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Pedestalmod.MOD_ID, name), item);
    }


    public static void registerModItems() {
        Pedestalmod.LOGGER.info("Registering ModItems for" + Pedestalmod.MOD_ID);


    }
}
