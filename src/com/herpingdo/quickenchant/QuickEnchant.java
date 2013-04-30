package com.herpingdo.quickenchant;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.herpingdo.quickenchant.listeners.PlayerListener;

public class QuickEnchant extends JavaPlugin {
	
	@Override
	public void onEnable()
	{
		PluginManager pm = this.getServer().getPluginManager();
		pm.registerEvents(new PlayerListener(), this);
	}

}
