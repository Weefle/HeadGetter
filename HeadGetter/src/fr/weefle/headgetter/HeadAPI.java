package fr.weefle.headgetter;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class HeadAPI {
	
	@SuppressWarnings("deprecation")
	public ItemStack getHead(String p){
		
		ItemStack i = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		ItemMeta m = i.getItemMeta();
		SkullMeta s = (SkullMeta) m;
		s.setOwner(p);
		i.setItemMeta(s);
		return i;
	}

}
