package projeto.testando.Comandos;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class KitHG implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {

        if(!(sender instanceof Player)) return false;
        Player p = (Player) sender;

        if(cmd.getName().equalsIgnoreCase("recraft")) {
            p.getInventory().addItem(new ItemStack(Material.BOWL, 32));
            p.getInventory().addItem(new ItemStack(Material.RED_MUSHROOM, 32));
            p.getInventory().addItem(new ItemStack(Material.BROWN_MUSHROOM, 32));
            p.sendMessage("§cRecraft adicionado ao seu inventário");
        }

        if(cmd.getName().equalsIgnoreCase("sword")) {
            if(args.length == 0) {
                p.sendMessage("§6Sword 1 - WOOD SWORD");
                p.sendMessage("§7Sword 2 - STONE SWORD");
                p.sendMessage("§fSword 3 - IRON SWORD");
            }

            if(args.length == 1) {
                if(args[0].equals("1")) {
                    p.getInventory().addItem(new ItemStack(Material.WOOD_SWORD));
                    p.sendMessage("§6Espada de MADEIRA setada");
                    return true;
                }

                if(args[0].equals("2")) {
                    p.getInventory().addItem(new ItemStack(Material.STONE_SWORD));
                    p.sendMessage("§7Espada de PEDRA setada");
                    return true;
                }

                if(args[0].equals("3")) {
                    p.getInventory().addItem(new ItemStack(Material.IRON_SWORD));
                    p.sendMessage("§fEspada de FERRO setada");
                    return true;
                }
            }
        }
        return false;
    }
}
