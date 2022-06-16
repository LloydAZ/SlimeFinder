package dev.soapy.slimefinder;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slimefinder implements ModInitializer
{
	public static final String MOD_ID = "slimefinder";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		//LOGGER.info("Hello Fabric world!");
		Registry.register(Registry.ITEM, new Identifier("slimefinder", "dowsing_rod"), new SlimefinderItem());
	}
}
