package com.nullblock.vemacs.antileak;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

public class CheckTask extends BukkitRunnable {

	public void run() {
		for (World w : Bukkit.getServer().getWorlds()) {
			if (w.getPlayers().size() == 0 && w.getName().toLowerCase().contains("pocket")) {
				Bukkit.getServer().unloadWorld(w, true);
				antileak().getLogger().info(
						w.getName() + " was forcefully unloaded!");
			}
		}
	}

	public Plugin antileak() {
		return Bukkit.getServer().getPluginManager().getPlugin("AntiLeak");
	}
}
