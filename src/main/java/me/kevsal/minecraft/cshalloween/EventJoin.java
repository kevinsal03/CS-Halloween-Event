package me.kevsal.minecraft.cshalloween;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.EventListener;

public class EventJoin implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();

        p.sendTitle(ChatColor.RED + "Haunted Server Event", ChatColor.DARK_RED + "/event for more details!", 10 ,70 ,10);

    }

}
