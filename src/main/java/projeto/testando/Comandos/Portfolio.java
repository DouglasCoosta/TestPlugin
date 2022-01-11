package projeto.testando.Comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Portfolio implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {

        if(!(sender instanceof Player)) return false;
        Player p = (Player) sender;

        if(cmd.getName().equalsIgnoreCase("Port")) {

            if(args.length == 0) {
                p.sendMessage("§3Digite /port Linkedin");
                p.sendMessage("§7Digite /port Github");
            }

            if(args.length == 1) {
                if(args[0].equalsIgnoreCase("Linkedin")) {
                    p.sendMessage("§3Linkedin - https://www.linkedin.com/in/douglas-costa-78983a228/");
                    return true;
                }

                if(args[0].equalsIgnoreCase("Github")) {
                    p.sendMessage("§7Github - https://github.com/DouglasCoosta");
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
