package fr.weefle.headgetter;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class HeadListener implements Listener {
	
	private Main m;
	public HeadListener(Main m) {
		this.m = m;
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		
		if(m.u.enabledingame) {
			if(m.u.update = true) {
			e.getPlayer().sendMessage("§6[§2Updater§6] §3Look at the console, there is an update for HeadGetter!");
			}else if(m.u.update = false){
				e.getPlayer().sendMessage("§6[§2Updater§6] §3There isn't update for HeadGetter!");
			}
		}
		
	}

}
