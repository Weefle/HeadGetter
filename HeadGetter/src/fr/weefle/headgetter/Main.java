package fr.weefle.headgetter;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getCommand("head").setExecutor(new CommandHead());
		super.onEnable();
	}

}
