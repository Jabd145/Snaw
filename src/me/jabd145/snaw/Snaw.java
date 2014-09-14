package me.jabd145.snaw;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class Snaw extends JavaPlugin{
	
	public void onEnable() {
		getLogger().info("Yolo enabled");
	}
	String end = ChatColor.MAGIC + "s";
	String prefix = ChatColor.LIGHT_PURPLE + "[" + ChatColor.WHITE + "Snaw" + ChatColor.LIGHT_PURPLE + "] ";
	String snaw = ChatColor.MAGIC + "s" + ChatColor.BLUE + "Snaw" + ChatColor.WHITE + end;

	public boolean onCommand(org.bukkit.command.CommandSender sender, org.bukkit.command.Command cmd, String label, String[] args ) {
		Player p = (Player) sender;
		Inventory inv = p.getInventory();
		List<String> ls = new ArrayList<String>();
		
		ls.add("This is Snaw!");
		ls.add("Snaw is love");
		ls.add("Snaw is life");
		if (cmd.getName().equalsIgnoreCase("snaw")) {
			inv.addItem(setName(new ItemStack(Material.SNOW_BLOCK), snaw, ls));
		    p.sendMessage(prefix + ChatColor.BLUE + "Have some Snaw");
	   }
		
		
        return true;
	
	}
	
	private ItemStack setName(ItemStack is, String name, List<String> lore) {
		ItemMeta im = is.getItemMeta();
		if (name != null)
			im.setDisplayName(name);
		if(lore != null)
			im.setLore(lore);
		is.setItemMeta(im);
		return is;
			
}
}
