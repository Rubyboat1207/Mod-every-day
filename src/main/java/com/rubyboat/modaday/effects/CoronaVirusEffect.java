package com.rubyboat.modaday.effects;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.ProjectileDamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.AbstractFireballEntity;
import net.minecraft.text.Text;
import org.jetbrains.annotations.Nullable;

public class CoronaVirusEffect extends StatusEffect {
    public CoronaVirusEffect() {
        super(StatusEffectCategory.HARMFUL, 0xcfa9a9);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
    int ticks;
    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        ticks++;
        if(ticks >= 255 - amplifier * 4)
        {
            entity.damage(DamageSource.GENERIC, 4);
            ticks = 0;
        }
        if(entity.isPlayer() )
        {
            ((PlayerEntity) entity).sendMessage(Text.of(String.valueOf(ticks)), true);
        }
    }
}
