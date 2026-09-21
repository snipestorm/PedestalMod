package net.adam.pedestalmod;

import net.adam.pedestalmod.block.ModBlocks;
import net.adam.pedestalmod.block.entity.ModBlockEntities;
import net.adam.pedestalmod.item.ModCreativeModeTab;
import net.adam.pedestalmod.screen.ModScreenHandlers;


import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pedestalmod implements ModInitializer {
	public static final String MOD_ID = "pedestalmod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandlers();
		ModCreativeModeTab.registerItemGroups();
	}
}

// This is Version 26.1 //