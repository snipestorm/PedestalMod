package net.adam.pedestalmod.block.entity;

import net.adam.pedestalmod.Pedestalmod;
import net.adam.pedestalmod.block.ModBlocks;
import net.adam.pedestalmod.block.entity.custom.PedestalBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<PedestalBlockEntity> PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestalmod.MOD_ID, "pedestal_be"),
                    FabricBlockEntityTypeBuilder.create(PedestalBlockEntity::new, ModBlocks.PEDESTAL).build(null));

    public static void registerBlockEntities() {
        Pedestalmod.LOGGER.info("Registering Block Entities for " + Pedestalmod.MOD_ID);
    }
}