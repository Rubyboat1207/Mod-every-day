package com.rubyboat.modaday;

import com.rubyboat.modaday.items.MirrorItem;
import com.rubyboat.modaday.items.TeleportationRodItem;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.item.ItemGroup;
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
	public static final TeleportationRodItem TELEROD = new TeleportationRodItem(new FabricItemSettings().group(ItemGroup.TOOLS).maxCount(1));
	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier(MODID, "mirror"), MIRROR_ITEM);
		Registry.register(Registry.ITEM, new Identifier(MODID, "teleportation_rod"), TELEROD);
	}


}
