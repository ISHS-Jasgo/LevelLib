package com.github.jasgo.levellib.event;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class EntityDamage implements Listener {
    @EventHandler
    public void onEntityDamage(EntityDamageByEntityEvent event) {
        if(event.getDamager() instanceof Player) {

        }
    }
}
