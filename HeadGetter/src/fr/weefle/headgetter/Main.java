package fr.weefle.headgetter;

import java.io.IOException;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public Updater u = new Updater(this);
	
	@Override
	public void onEnable() {
		getCommand("gethead").setExecutor(new CommandHead(this));
		getServer().getPluginManager().registerEvents(new HeadListener(this), this);
		try {
			new Updater(this, 42527);
		} catch (IOException e) {
			e.printStackTrace();
		}
		super.onEnable();
	}

}
