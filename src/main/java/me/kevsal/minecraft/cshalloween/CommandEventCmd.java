package me.kevsal.minecraft.cshalloween;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandEventCmd implements CommandExecutor {


    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;

        p.sendMessage(ChatColor.DARK_RED + "Happy Halloween!");
        p.sendMessage(ChatColor.YELLOW + "ClubSurvival is celebrating Halloween with the Haunted Server Event!");
        p.sendMessage(ChatColor.YELLOW + "The server will randomly apply blindness to all players or a single player.");
        p.sendMessage(ChatColor.YELLOW + "It will also play a pseudo-randomly selected sound from the game to a random player at random times!");
        p.sendMessage(ChatColor.YELLOW + "This project is open source! See the code at: ");
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "tellraw " + p.getName() + " [\"\",{\"text\":\"https://github.com/kevinsal03/CS-Halloween-Event\",\"color\":\"aqua\",\"clickEvent\":{\"action\":\"open_url\",\"value\":\"https://github.com/kevinsal03/CS-Halloween-Event\"},\"hoverEvent\":{\"action\":\"show_text\",\"value\":[\"\",{\"text\":\"Project GitHub page\"}]}}]");

        return true;
    }
}
