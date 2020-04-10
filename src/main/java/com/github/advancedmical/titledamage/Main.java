package com.github.advancedmical.titledamage;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.Plugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        super.onEnable();
        Bukkit.getPluginManager().registerEvents((Listener)new DamageListener(), (Plugin)this) ;
        Bukkit.getPluginManager().registerEvents((Listener)new RespawnListener(), (Plugin)this);
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
