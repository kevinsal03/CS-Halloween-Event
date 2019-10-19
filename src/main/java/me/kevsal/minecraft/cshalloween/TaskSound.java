package me.kevsal.minecraft.cshalloween;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

import java.util.Random;

public class TaskSound implements Runnable {

    //class will handle playing sounds randomly to players

    private static Random rand = new Random();

    public void run() {

        if (rand.nextBoolean()) {
            //play a sound

            //player array
            Player[] playerArray = Bukkit.getOnlinePlayers().toArray(new Player[0]);
            //array of sounds
            Sound[] sounds = new Sound[]{Sound.ENTITY_BAT_DEATH, Sound.AMBIENT_CAVE, Sound.BLOCK_ANVIL_USE, Sound.BLOCK_DISPENSER_DISPENSE, Sound.ENTITY_DROWNED_DEATH_WATER, Sound.ENTITY_ILLUSIONER_CAST_SPELL, Sound.BLOCK_GLASS_BREAK, Sound.ENTITY_PLAYER_BURP, Sound.ENTITY_PLAYER_HURT}; //sounds

            if (playerArray.length != 0) {
                //select the player
                Player p = playerArray[rand.nextInt(playerArray.length)];
                //select the sound
                Sound sound = sounds[rand.nextInt(sounds.length)];

                //play the sound
                p.playSound(p.getLocation(), sound, 50, 0.5F);

                Bukkit.getServer().getLogger().info("Sound task ran and played a sound");
            } else {
                Bukkit.getServer().getLogger().info("No online players, no sound played.");
            }

        } else {
            //no playsound
            Bukkit.getServer().getLogger().info("Sound task ran but did not play a sound");
        }
    }
}
