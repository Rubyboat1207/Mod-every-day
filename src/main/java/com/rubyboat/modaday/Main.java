package com.rubyboat.modaday;

import com.rubyboat.modaday.effects.CoronaVirusEffect;
import com.rubyboat.modaday.items.BatMaterial;
import com.rubyboat.modaday.items.MirrorItem;
import com.rubyboat.modaday.items.TeleportationRodItem;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
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
	public static final Item BAT_MEAT = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
	public static final ToolItem BAT_SWORD = new SwordItem(BatMaterial.INSTANCE, 3, 1f, new Item.Settings().group(ItemGroup.COMBAT));
	public static final TeleportationRodItem TELEROD = new TeleportationRodItem(new FabricItemSettings().group(ItemGroup.TOOLS).maxCount(1));
	public static final StatusEffect COVID19 = new CoronaVirusEffect();
	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier(MODID, "mirror"), MIRROR_ITEM);
		Registry.register(Registry.ITEM, new Identifier(MODID, "teleportation_rod"), TELEROD);
		Registry.register(Registry.ITEM, new Identifier(MODID, "bat_meat"), BAT_MEAT);
		Registry.register(Registry.ITEM, new Identifier(MODID, "bat_sword"), BAT_SWORD);
		Registry.register(Registry.STATUS_EFFECT, new Identifier(MODID, "covid19"), COVID19);
	}


}
