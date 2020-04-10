package com.github.advancedmical.titledamage;

import org.bukkit.Sound;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class DamageListener implements Listener {

    @EventHandler
    public void onDamage(EntityDamageEvent event){
        if (event.getEntityType() == EntityType.PLAYER){
            Player player = (Player) event.getEntity();
            if (player.getHealth() < JavaPlugin.getPlugin(Main.class).getConfig().getInt("bufit")){
                player.sendTitle(JavaPlugin.getPlugin(Main.class).getConfig().getString("bufittitle"), null, 10, 50, 20);
            }
            if (player.getHealth() < JavaPlugin.getPlugin(Main.class).getConfig().getInt("wei")){
                player.sendTitle(JavaPlugin.getPlugin(Main.class).getConfig().getString("weititle"), null, 10, 50, 20);
            }
            if (player.getHealth() == JavaPlugin.getPlugin(Main.class).getConfig().getInt("die")){
                player.sendTitle(JavaPlugin.getPlugin(Main.class).getConfig().getString("dietitle"), null, 10, 50, 20);
                player.playSound(player.getLocation(), Sound.ENTITY_ENDER_DRAGON_DEATH, 100F, 0.0F);
            }
        }
    }
}
