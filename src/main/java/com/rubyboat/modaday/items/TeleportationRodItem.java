package com.rubyboat.modaday.items;

import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class TeleportationRodItem extends Item {
    public TeleportationRodItem(Settings settings) {
        super(settings);
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        Vec3d vector = user.getPos().add(user.getRotationVector().multiply(20.0));
        if(world.getBlockState(new BlockPos(vector.x, vector.y, vector.z)) == Blocks.AIR.getDefaultState())
        {
            user.updatePosition(vector.x, vector.y, vector.z);
            return TypedActionResult.success(user.getStackInHand(hand));
        }
        return TypedActionResult.pass(user.getStackInHand(hand));
    }
}