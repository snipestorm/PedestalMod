package net.adam.pedestalmod.block.custom;

import com.mojang.serialization.MapCodec;
import net.adam.pedestalmod.block.entity.custom.PedestalBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.server.dedicated.Settings;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

import javax.swing.text.html.BlockView;

import static net.minecraft.world.InteractionResult.SUCCESS;


public class PedestalBlock extends BlockWithEntity implements BlockEntityProvider {

    private static final VoxelShape SHAPE = PedestalBlock.createCuboidShape(2,0,2,14,13,14);

    public static final MapCodec<PedestalBlock> CODEC = PedestalBlock.createCodec((PedestalBlock::new));


    public  PedestalBlock(Settings settings) {
        super(settings);
    }

   @Override
   protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
   }

    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec() {
        return CODEC;
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new PedestalBlockEntity(pos, state);
    }

    @Override
    protected BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }



    @Override
    protected InteractionResult onUseWithItem(ItemStack stack, BlockState state, Level world, BlockPos pos,
                                              Player player, InteractionHand hand, BlockHitResult hit) {
        if(world.getBlockEntity(pos) instanceof PedestalBlockEntity pedestalBlockEntity) {
            if(pedestalBlockEntity.isEmpty() && !stack.isEmpty()) {
                pedestalBlockEntity.setStack(0, stack);
                world.playSound(player, pos, SoundEvents.ENTITY_ITEM_PICKUP, SoundCategory.BLOCKS, 1f, 2f);
                stack.decrement(1);

                pedestalBlockEntity.markDirty();
                world.updateListeners(pos, state, state, 0);
            } else if(stack.isEmpty() && !player.isSneaking()) {
                ItemStack stackOnPedestal = pedestalBlockEntity.getStack(0);
                player.setStackInHand(Hand.MAIN_HAND, stackOnPedestal);
                world.playSound(player, pos, SoundEvents.ENTITY_ITEM_PICKUP, SoundCategory.BLOCKS, 1f, 1f);
                pedestalBlockEntity.clear();

                pedestalBlockEntity.markDirty();
                world.updateListeners(pos, state, state, 0);
            } else if(player.isSneaking() && !world.isClient()) {
                player.openHandledScreen(pedestalBlockEntity);
            }
        }

        return SUCCESS;
    }
}
