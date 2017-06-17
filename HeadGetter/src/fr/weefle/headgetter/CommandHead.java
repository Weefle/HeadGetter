package fr.weefle.headgetter;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CommandHead implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
		
		if (sender instanceof Player){
			Player p = (Player) sender;
			if(cmd.getName().equalsIgnoreCase("head")){
				if(args.length == 0){
				p.sendMessage("§4Pas assez d'arguments! §6| §3/head <name>");
				}
				if(args.length == 1){
					HeadAPI h = new HeadAPI();
					ItemStack i = new ItemStack(h.getHead(args[0]));
					p.getInventory().addItem(i);
					p.updateInventory();
					p.sendMessage("§2Tu as reçus la tête de " + args[0]);
				}
				if(args.length > 1){
					p.sendMessage("§4Trop d'arguments! §6| §3/head <name>");
				}
				}
			}
		
		return true;
	}

}
