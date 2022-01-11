package projeto.testando.Comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Feitico implements CommandExecutor {


    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {

        if(!(sender instanceof Player)) return false;
        Player p = (Player) sender;

        if(cmd.getName().equalsIgnoreCase("jump")) {
            p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 18000, 5));

            return false;
        }
        return false;
    }
}
