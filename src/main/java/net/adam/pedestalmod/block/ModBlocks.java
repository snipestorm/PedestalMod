package net.adam.pedestalmod.block;

import net.adam.pedestalmod.Pedestalmod;
import net.adam.pedestalmod.block.custom.PedestalBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {

    public static final Block PEDESTAL = registerBlock("pedestal",
            properties -> new PedestalBlock(properties.nonOpaque().strength(4).requiresTool()));


    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> function) {
        Block toRegister = function.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Pedestalmod.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(Registries.BLOCK, Identifier.of(Pedestalmod.MOD_ID, name), toRegister);
    }


    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Pedestalmod.MOD_ID, name),
                new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Pedestalmod.MOD_ID, name)))));
    }



    public static void registerModBlocks() {
        Pedestalmod.LOGGER.info("Registering ModBlocks for" + Pedestalmod.MOD_ID);
    }
}
