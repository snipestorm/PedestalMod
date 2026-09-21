package net.adam.pedestalmod;

import net.adam.pedestalmod.block.entity.ModBlockEntities;
import net.adam.pedestalmod.block.entity.renderer.PedestalBlockEntityRenderer;
import net.adam.pedestalmod.screen.ModScreenHandlers;
import net.adam.pedestalmod.screen.custom.PedestalScreen;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;

public class PedestalModClient implements ClientModInitializer {
    /**
     * Runs the mod initializer on the client environment.
     */
    @Override
    public void onInitializeClient() {
        BlockEntityRenderers.register(ModBlockEntities.PEDESTAL_BE, PedestalBlockEntityRenderer::new);
        MenuScreens.register(ModScreenHandlers.PEDESTAL_MENU, PedestalScreen::new);
    }
}
