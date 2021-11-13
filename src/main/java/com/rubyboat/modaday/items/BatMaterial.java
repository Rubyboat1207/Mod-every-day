package com.rubyboat.modaday.items;

import com.rubyboat.modaday.Main;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class BatMaterial implements ToolMaterial {

    public static final BatMaterial INSTANCE = new BatMaterial();

    @Override
    public int getDurability() {
        return 1200;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 3;
    }

    @Override
    public float getAttackDamage() {
        return 2;
    }

    @Override
    public int getMiningLevel() {
        return 2;
    }

    @Override
    public int getEnchantability() {
        return 22;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Main.BAT_MEAT);
    }

}
