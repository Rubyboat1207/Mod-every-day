package com.rubyboat.modaday.items;

import com.rubyboat.modaday.Main;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class GoldenPickaxeMaterial implements ToolMaterial {

    public static final GoldenPickaxeMaterial INSTANCE = new GoldenPickaxeMaterial();

    @Override
    public int getDurability() {
        return 32*3;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 69000;
    }

    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 69;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.GOLD_INGOT);
    }

}
