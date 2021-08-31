package com.github.jasgo.levellib.event;

import com.github.jasgo.levellib.mobs.Mob;
import io.lumine.xikage.mythicmobs.api.bukkit.events.MythicMobDeathEvent;
import io.lumine.xikage.mythicmobs.mobs.ActiveMob;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class MythicMobKill implements Listener {
    @EventHandler
    public void onMythicMobDeath(MythicMobDeathEvent event) {
        if(event.getKiller() instanceof Player) {
            ActiveMob mob = event.getMob();
            for (Mob value : Mob.values()) {
                if (value.name().equalsIgnoreCase(mob.getMobType())) {
                    Bukkit.getPluginManager().callEvent(new MobKillEvent((Player) event.getKiller(), value));
                }
            }
        }
    }
}
