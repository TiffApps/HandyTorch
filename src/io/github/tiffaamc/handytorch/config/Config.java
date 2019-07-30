package io.github.tiffaamc.handytorch.config;

import java.util.List;

import org.bukkit.configuration.file.FileConfiguration;

public class Config {
	
	private static List<String> GLOWING_ITEMS;
	
	public static void load(FileConfiguration config)
	{
		GLOWING_ITEMS = config.getStringList("Glowing-items");
	}

	public static List<String> getAllowedItems() {
		return GLOWING_ITEMS;
	}

}
