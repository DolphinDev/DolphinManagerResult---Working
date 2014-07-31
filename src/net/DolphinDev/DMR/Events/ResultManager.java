package net.DolphinDev.DMR.Events;

import net.DolphinDev.StringAPI.MessageManager;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerLoginEvent.Result;

public class ResultManager implements Listener {
	
	 
	

	@EventHandler
	public void onResult(PlayerLoginEvent e) {
		Player p = e.getPlayer();
		if(p.isBanned()) {
			e.setResult(Result.KICK_BANNED);
			  e.setKickMessage(ChatColor.DARK_RED + "[DolphinsArcade] You have been Banned from this Server! Appeal at " + MessageManager.getBanAppealLink());
		 if(e.getResult() == Result.KICK_FULL) {
			  e.allow();
		  if(e.getResult() == Result.KICK_WHITELIST) {
			    if(e.getKickMessage().equalsIgnoreCase("You are not whitelisted on this server!")) {
			    	 e.setKickMessage(ChatColor.DARK_RED + "DolphinsArcade: Were currently in maintenance mode, Follow @ZonexCube_MC For More Details!");
			    }
		  }
			 
			  
		 }
			  
		}
	}
	
	
}
