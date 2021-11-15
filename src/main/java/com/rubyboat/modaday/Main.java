package com.rubyboat.modaday;

import com.rubyboat.modaday.effects.CoronaVirusEffect;
import com.rubyboat.modaday.items.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MODID = "mod_a_day";
	public static final MirrorItem MIRROR_ITEM = new MirrorItem(new FabricItemSettings().group(ItemGroup.TOOLS).maxCount(1));
	public static final FoodComponent BAT_MEAT_FOOD = new FoodComponent.Builder().hunger(7).saturationModifier(5).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 120 * 20, 3), 100).build();
	public static final BatMeatItem BAT_MEAT = new BatMeatItem(new FabricItemSettings().group(ItemGroup.MATERIALS).food(BAT_MEAT_FOOD));
	public static final ToolItem BAT_SWORD = new SwordItem(BatMaterial.INSTANCE, 3, 1f, new Item.Settings().group(ItemGroup.COMBAT));
	public static final ToolItem GOLD_PICK_PICK = new CustomPickaxeItem(GoldenPickaxeMaterial.INSTANCE, 3, 1f, new Item.Settings().group(ItemGroup.TOOLS));
	public static final TeleportationRodItem TELEROD = new TeleportationRodItem(new FabricItemSettings().group(ItemGroup.TOOLS).maxCount(1));
	public static final StatusEffect COVID19 = new CoronaVirusEffect();
	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier(MODID, "mirror"), MIRROR_ITEM);
		Registry.register(Registry.ITEM, new Identifier(MODID, "teleportation_rod"), TELEROD);
		Registry.register(Registry.ITEM, new Identifier(MODID, "bat_meat"), BAT_MEAT);
		Registry.register(Registry.ITEM, new Identifier(MODID, "bat_sword"), BAT_SWORD);
		Registry.register(Registry.ITEM, new Identifier(MODID, "golden_pickaxe_pickaxe"), GOLD_PICK_PICK);
		Registry.register(Registry.STATUS_EFFECT, new Identifier(MODID, "covid19"), COVID19);
	}


}
