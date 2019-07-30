package io.github.tiffaamc.handytorch;

import org.bukkit.plugin.java.JavaPlugin;

import io.github.tiffaamc.handytorch.command.HandyTorchCommand;
import io.github.tiffaamc.handytorch.config.Config;
import io.github.tiffaamc.handytorch.listener.LightItemHeldListener;


public class HandyTorch extends JavaPlugin
{
	
	private static HandyTorch _instance;

	@Override
	public void onLoad()
	{
		_instance = this;
		saveDefaultConfig();
	}

	@Override
	public void onEnable() {
		Config.load(getConfig());
		getCommand("handytorch").setExecutor(new HandyTorchCommand());
		getServer().getPluginManager().registerEvents(new LightItemHeldListener(), this);
	}

	public void reload()
    {
        reloadConfig();
        Config.load(getConfig());
    }

	public static HandyTorch instance() {
		return _instance;
	}

}
