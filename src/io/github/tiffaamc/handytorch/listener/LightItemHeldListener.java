package io.github.tiffaamc.handytorch.listener;

import java.util.List;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import io.github.tiffaamc.handytorch.PlayerLight;
import io.github.tiffaamc.handytorch.config.Config;

public class LightItemHeldListener implements Listener {
	
	private final List<String> allowedItems = Config.getAllowedItems();
	private PlayerLight light;
//	private Location oldLoc = null;
	
	@EventHandler
	public void onPlayerMove(PlayerMoveEvent event)
	{
		Player player = event.getPlayer();

		if (isInList(player.getInventory().getItemInOffHand().getType(), allowedItems)) {
			
//			if (oldLoc != null)
//				LightAPI.deleteLight(oldLoc, false);
			
			Location loc = player.getLocation();
//			oldLoc = loc;

			light.setLightLocation(loc);
		}
	}
	
	@EventHandler
	public void onPlayerUnequipTorch(Player)

	public static boolean isInList(Material target, List<String> list)
	{
        if (list == null)
            return false;

        for (String string : list)
            if (target.toString().equalsIgnoreCase(string))
                return true;

        return false;
    }

}
