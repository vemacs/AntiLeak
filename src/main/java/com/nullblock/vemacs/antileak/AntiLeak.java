package com.nullblock.vemacs.antileak;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

public class AntiLeak extends JavaPlugin {
	public void onDisable() {
	}

	public void onEnable() {
		BukkitTask check = new CheckTask().runTaskTimer(this, 0, 300);
		this.getLogger().info("AntiLeak started task with ID: " + check.getTaskId());
	}
}
