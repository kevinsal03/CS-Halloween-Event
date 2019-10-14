package me.kevsal.minecraft.cshalloween;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Random;

public class TaskBlindness implements Runnable {

    private static Random rand = new Random();

    public void run() {
        Bukkit.getServer().getOnlinePlayers();

        if (rand.nextBoolean()) {
            Bukkit.getServer().getLogger().info("Ran task and applied effect.");
            //yes do effect
            if(rand.nextBoolean()) {
                //do blindness for all
                for (Player p : Bukkit.getOnlinePlayers()) {
                    p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 300, 1), true);
                    p.sendTitle(null, ChatColor.RED + "All players have been randomly blinded!", 3, 70, 3);
                }
            } else {
                //get all online players as an array
                Player[] playerArray = Bukkit.getOnlinePlayers().toArray(new Player[0]);
                //select a random one
                if (playerArray.length != 0) {
                    Player p2 = playerArray[rand.nextInt(playerArray.length)];
                    //give blindness
                    p2.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 300, 5), true);
                    //say blind
                    p2.sendTitle(null, ChatColor.RED + "You have been randomly blinded!", 3, 70, 3);
                    p2.sendMessage("" + ChatColor.RED + ChatColor.BOLD + "We have also given you resistance for your safety.");
                    p2.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 300, 10), true);
                    Bukkit.getServer().broadcastMessage(ChatColor.DARK_RED + "[Haunted Server] " + ChatColor.RESET + p2.getDisplayName() + " has been randomly blinded!" );
                }

            }
        } else {
            //no dont do effect
            Bukkit.getServer().getLogger().info("Ran task but no effect was applied.");
        }
    }
}
