package me.kevsal.minecraft.cshalloween;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class EventJoin implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();

        p.sendTitle(ChatColor.RED + "Haunted Server Event", ChatColor.DARK_RED + "/event for more details!", 10 ,70 ,10);
        p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 90, 1), true);

    }

}
