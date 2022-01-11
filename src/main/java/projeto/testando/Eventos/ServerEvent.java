package projeto.testando.Eventos;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public class ServerEvent implements Listener {

    @EventHandler
    public void quandoPingar(ServerListPingEvent e) {
        if(!Bukkit.hasWhitelist()) e.setMotd("§aServidor Aberto. Vem se divertir pae :D");
        else e.setMotd("§5Servidor fechado pae. Tenta amanhã ;-;");
    }
}
