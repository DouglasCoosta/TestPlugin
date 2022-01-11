package projeto.testando.Eventos;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerEvent implements Listener {

    @EventHandler
    public void quandoQuebrarBloco(BlockBreakEvent e) {
        Player p = e.getPlayer();
        Block b = e.getBlock();

        if(b.getType().equals(Material.GRASS)) {
            p.getInventory().addItem(new ItemStack(Material.WOOD_PICKAXE));
        }

        if(b.getType().equals(Material.STONE)) {
            p.getInventory().addItem(new ItemStack(Material.STONE_SWORD));
        }
    }

    @EventHandler
    public void quandoEntrar(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        p.sendMessage("§dFaala Pae. §5Seja bem vindo ao servidor");
    }

}
