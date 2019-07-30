package io.github.tiffaamc.handytorch;

import org.bukkit.Location;

import ru.beykerykt.lightapi.LightAPI;
import ru.beykerykt.lightapi.chunks.ChunkInfo;

public class PlayerLight {

	private Location location;
	
	public void setLightLocation(Location loc) {
		LightAPI.createLight(loc, 15, true);
		updateLightLocation(loc);
	}
	
	private void updateLightLocation(Location loc) {
		for (ChunkInfo info : LightAPI.collectChunks(loc, 15))
			LightAPI.updateChunk(info);
	}

	public Location getLocation() {
		return location;
	}
}
