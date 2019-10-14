package me.kevsal.minecraft.cshalloween;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @EventHandler
    public void onEnable() {
        Bukkit.getServer().getPluginManager().registerEvents(new EventJoin(), this);
    }

    @EventHandler
    public void onDisable() {

    }

}
