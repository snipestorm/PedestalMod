package net.adam.pedestalmod.item;

import net.adam.pedestalmod.Pedestalmod;
import net.adam.pedestalmod.block.ModBlocks;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab PEDESTAL_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Pedestalmod.MOD_ID, "pedestal"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.PEDESTAL.asItem()))
                    .title(Component.translatable("itemgroup.pedestal"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.PEDESTAL);
                    }).build());

    public static void registerItemGroups() {
       Pedestalmod.LOGGER.info("Registering Item Groups for " + Pedestalmod.MOD_ID);
    }
}