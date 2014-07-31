package net.DolphinDev.DMR;


import net.DolphinDev.DMR.Events.ResultManager;
import net.DolphinDev.StringAPI.MessageManager;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;


public class Startup extends JavaPlugin {
	
	public void onEnable() {
		System.out.println(ChatColor.GREEN + "[DolphinManagerResult] Website: " + MessageManager.getDonationLink());
	     execute();
		//Why not green?
		//Testing ;P it might be Color.GREEN instead 
	}

	
	
	private void execute() {
		getServer().getPluginManager().registerEvents(new ResultManager(), this);

		
	}



	@Override
	public void onDisable() {
         System.out.println("CHECK OUT THE WEBSITE PLS!");
	}
	
	
	
}
