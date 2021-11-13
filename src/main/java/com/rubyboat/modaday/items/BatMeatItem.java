package com.rubyboat.modaday.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Random;

public class BatMeatItem extends Item {
    public BatMeatItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        int randomchance = new Random().nextInt(10);
        if(randomchance == 2)
        {
            //give coronavirus
        }
        return super.finishUsing(stack, world, user);
    }
}
