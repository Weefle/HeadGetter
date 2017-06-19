package fr.weefle.headgetter;

import java.io.IOException;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getCommand("gethead").setExecutor(new CommandHead());
		try {
			new SpigotUpdater(this, 42527);
		} catch (IOException e) {
			e.printStackTrace();
		}
		super.onEnable();
	}

}
