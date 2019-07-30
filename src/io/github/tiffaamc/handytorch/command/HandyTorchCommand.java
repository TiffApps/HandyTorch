package io.github.tiffaamc.handytorch.command;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import io.github.tiffaamc.handytorch.HandyTorch;


public class HandyTorchCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if (args.length > 0 && (sender.hasPermission("handytorch.admin") || sender == Bukkit.getConsoleSender()))
        {
            if (args[0].equalsIgnoreCase("reload"))
            {
                HandyTorch.instance().reload();
                sender.sendMessage("§6HandyTorch's configuration is reloaded!");
                return true;
            }
        }
		return false;
	}

}
