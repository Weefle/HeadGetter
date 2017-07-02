package fr.weefle.headgetter;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CommandHead implements CommandExecutor {
	
	private Main main;
	private Player p;
	private int task;
	private int timer;
	private String[] args;
	
	public CommandHead(Main main) {
		this.main = main;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
		
		if (sender instanceof Player){
			p = (Player) sender;
			if(cmd.getName().equalsIgnoreCase("gethead")){
				if(args.length == 0){
				p.sendMessage("§4Too many arguments! §6| §3/gethead <name> <name> ...");
				}
				if(args.length >= 1){
					HeadAPI h = new HeadAPI();
					for(String s : args){
					ItemStack i = new ItemStack(h.getHead(s));
						p.getInventory().addItem(i);
						p.sendMessage("§2You received the §6" + s + "§2's head!");
					}
					this.args = args;
					refresh();
				}
			
				}
			}
		
		return true;
	}
	
	public void refresh() {
		timer = args.length;
		task = Bukkit.getScheduler().scheduleSyncRepeatingTask(main, () -> {
			timer--;
			p.updateInventory();
			if(timer == 0) {
				Bukkit.getScheduler().cancelTask(task);
				p.updateInventory();
			}
			}, 20L, 20L);
	}

}