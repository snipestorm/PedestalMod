package net.adam.pedestalmod;

import net.adam.pedestalmod.block.ModBlocks;
import net.adam.pedestalmod.block.entity.ModBlockEntities;
import net.adam.pedestalmod.item.ModItemGroups;
import net.adam.pedestalmod.item.ModItems;
import net.adam.pedestalmod.screen.ModScreenHandlers;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pedestalmod implements ModInitializer {
	public static final String MOD_ID = "pedestalmod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandlers();
		ModItemGroups.registerItemGroups();
	}
}