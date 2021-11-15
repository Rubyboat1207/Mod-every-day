package com.rubyboat.modaday.mixin;

import com.rubyboat.modaday.Main;
import com.rubyboat.modaday.effects.CoronaVirusEffect;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Iterator;
import java.util.Map;
import java.util.Random;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {
    @Inject(at = @At("HEAD"), method = "damage", cancellable = true)
    public void damage(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir)
    {
        if(source.getAttacker() instanceof LivingEntity attacker)
        {
            if(attacker.hasStatusEffect(Main.COVID19))
            {
                int random = new Random().nextInt(5);
                ((LivingEntity)(Object)this).addStatusEffect(new StatusEffectInstance(Main.COVID19, 12 * 60 * 20, 0));
            }
        }
    }
}
