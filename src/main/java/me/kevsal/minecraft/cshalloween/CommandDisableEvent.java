/*package me.kevsal.minecraft.cshalloween;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandDisableEvent implements CommandExecutor {

    private Main plugin;

    public CommandDisableEvent(Main main) {

        this.plugin = main;

    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {


        Player p = (Player) sender;

        if(p.hasPermission("cs.event.op")) {
            p.sendMessage("Plugin disabled");
            Bukkit.getServer().getPluginManager().disablePlugin(plugin);
        }

        return true;
    }
}*/
