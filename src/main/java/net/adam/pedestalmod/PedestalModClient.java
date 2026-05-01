package net.adam.pedestalmod;

import net.adam.pedestalmod.block.entity.ModBlockEntities;
import net.adam.pedestalmod.block.entity.renderer.PedestalBlockEntityRenderer;
import net.adam.pedestalmod.screen.ModScreenHandlers;
import net.adam.pedestalmod.screen.custom.PedestalScreen;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

public class PedestalModClient implements ClientModInitializer {
    /**
     * Runs the mod initializer on the client environment.
     */
    @Override
    public void onInitializeClient() {
        BlockEntityRendererFactories.register(ModBlockEntities.PEDESTAL_BE, PedestalBlockEntityRenderer::new);
        HandledScreens.register(ModScreenHandlers.PEDESTAL_SCREEN_HANDLER, PedestalScreen::new);
    }
}
