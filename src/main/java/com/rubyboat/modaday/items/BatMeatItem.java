package com.rubyboat.modaday.items;

import com.rubyboat.modaday.Main;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
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
        Random rnd = new Random();
        int i = rnd.nextInt(100);
        if(i <= 10) {
            user.addStatusEffect(new StatusEffectInstance(Main.COVID19, 12 * 60 * 20, 0));
        }

        return super.finishUsing(stack, world, user);
    }
}
