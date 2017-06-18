package fr.weefle.headgetter;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getCommand("gethead").setExecutor(new CommandHead(this));
		super.onEnable();
	}

}
