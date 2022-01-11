package projeto.testando;

import org.bukkit.Bukkit;

import static projeto.testando.TestePlugin.*;

public class Config {

    public static void exibirDados() {
        for(String dados : getInstance().getConfig().getConfigurationSection("Pessoas").getKeys(false)) {

            Bukkit.getConsoleSender().sendMessage("Nome da " + dados + ": " + getInstance().getConfig().getString("Pessoas."+dados+".nome"));
            Bukkit.getConsoleSender().sendMessage("Idade da " + dados + ": " + getInstance().getConfig().getString("Pessoas."+dados+".idade"));
            Bukkit.getConsoleSender().sendMessage("==============================");
        }
    }
}
