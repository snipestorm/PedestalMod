package net.adam.pedestalmod.item;

import net.adam.pedestalmod.Pedestalmod;
import net.adam.pedestalmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup PEDESTAL = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Pedestalmod.MOD_ID, "pedestal"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.pedestal"))
                    .icon(() -> new ItemStack(ModBlocks.PEDESTAL)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.PEDESTAL);
                    }).build());

    public static void registerItemGroups() {
       Pedestalmod.LOGGER.info("Registering Item Groups for " + Pedestalmod.MOD_ID);
    }
}