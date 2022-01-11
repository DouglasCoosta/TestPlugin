package projeto.testando;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import projeto.testando.Comandos.*;
import projeto.testando.Eventos.PlayerEvent;
import projeto.testando.Eventos.ServerEvent;

public class TestePlugin extends JavaPlugin {

    private static TestePlugin instance;

    @Override
    public void onEnable() {
        instance = this;

        Bukkit.getConsoleSender().sendMessage("§ePlugin iniciado com sucesso kereio");

        loadConfig();
        Config.exibirDados();
        registrarEvento();
        registrarComando();
    }

    private void registrarEvento() {
        Bukkit.getPluginManager().registerEvents(new ServerEvent(), this);
        Bukkit.getPluginManager().registerEvents(new PlayerEvent(), this);
    }

    private void registrarComando() {
        getCommand("Port").setExecutor(new Portfolio());
        getCommand("jump").setExecutor(new Feitico());
        getCommand("recraft").setExecutor(new KitHG());
        getCommand("sword").setExecutor(new KitHG());
    }

    public void loadConfig() {
        getConfig().options().copyDefaults(true);
        saveDefaultConfig();
    }

    public static TestePlugin getInstance() {
        return instance;
    }
}
