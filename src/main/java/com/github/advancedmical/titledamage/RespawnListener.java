package com.github.advancedmical.titledamage;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class RespawnListener implements Listener {

    @EventHandler
    public void Respawn(PlayerRespawnEvent event){
        double r = Math.random();
        Player player = event.getPlayer();
        if (r < 0.01D){
            player.sendTitle(JavaPlugin.getPlugin(Main.class).getConfig().getString("restitle"), null, 10, 50, 20);
        }
    }
}
