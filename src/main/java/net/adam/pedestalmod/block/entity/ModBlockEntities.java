package net.adam.pedestalmod.block.entity;

import net.adam.pedestalmod.Pedestalmod;
import net.adam.pedestalmod.block.ModBlocks;
import net.adam.pedestalmod.block.entity.custom.PedestalBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.entity.BlockEntityType;


public class ModBlockEntities {
    public static final BlockEntityType<PedestalBlockEntity> PEDESTAL_BE =
            Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, Identifier.fromNamespaceAndPath(Pedestalmod.MOD_ID, "pedestal_be"),
                    FabricBlockEntityTypeBuilder.create(PedestalBlockEntity::new, ModBlocks.PEDESTAL).build());

    public static void registerBlockEntities() {
        Pedestalmod.LOGGER.info("Registering Block Entities for " + Pedestalmod.MOD_ID);
    }
}