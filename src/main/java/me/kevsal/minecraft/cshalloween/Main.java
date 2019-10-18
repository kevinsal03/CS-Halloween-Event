package me.kevsal.minecraft.cshalloween;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @EventHandler
    public void onEnable() {
        //register events
        Bukkit.getServer().getPluginManager().registerEvents(new EventJoin(), this); //register the login event

        //schedule repeating task
        Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new TaskBlindness(), 0L, 12000L); //600L for debug - 12000L
        Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new TaskSound(), 0L, 8400L); //600L for debug - 8400L
    }

    @EventHandler
    public void onDisable() {

    }

}
