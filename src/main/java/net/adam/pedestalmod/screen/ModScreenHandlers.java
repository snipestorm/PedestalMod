package net.adam.pedestalmod.screen;


import net.adam.pedestalmod.Pedestalmod;
import net.adam.pedestalmod.screen.custom.PedestalMenu;
import net.fabricmc.fabric.api.menu.v1.ExtendedMenuType;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.inventory.MenuType;

public class ModScreenHandlers {
    public static final MenuType<PedestalMenu> PEDESTAL_MENU =
            Registry.register(BuiltInRegistries.MENU, Identifier.fromNamespaceAndPath(Pedestalmod.MOD_ID, "pedestal_menu"),
                    new ExtendedMenuType<>(PedestalMenu::new, BlockPos.STREAM_CODEC));

    public static void registerScreenHandlers() {
        Pedestalmod.LOGGER.info("Registering Screen Handlers for " + Pedestalmod.MOD_ID);
    }
}