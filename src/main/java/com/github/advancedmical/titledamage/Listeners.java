package com.github.advancedmical.titledamage;

import org.bukkit.Sound;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Listeners implements Listener {

    @EventHandler
    public void onDamage(EntityDamageEvent event){
        if (event.getEntityType() == EntityType.PLAYER){
            Player player = (Player) event.getEntity();
                    if (player.getHealth() < 4.0D){
                        player.sendTitle(JavaPlugin.getPlugin(Main.class).getConfig().getString("weititle"), null, 10, 50, 20);
                    }
                }
        }
    @EventHandler
    public void onPlayerRespawn(PlayerRespawnEvent e) {
        double random = Math.random();
        Player p = e.getPlayer();
        if (random < 0.01D) {
            p.sendTitle(JavaPlugin.getPlugin(Main.class).getConfig().getString("restitle"), null, 10, 50, 20);
        } else {
            p.sendTitle(JavaPlugin.getPlugin(Main.class).getConfig().getString("dietitle"), null, 10, 50, 20);
        }
        p.playSound(p.getLocation(), Sound.ENTITY_CHICKEN_HURT, 100.0F, 0.0F);
    }
    }
