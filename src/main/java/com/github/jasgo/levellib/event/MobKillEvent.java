package com.github.jasgo.levellib.event;

import com.github.jasgo.levellib.mobs.Mob;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class MobKillEvent extends Event {

    public static HandlerList HANDLERS = new HandlerList();
    private final Player player;
    private final Mob mob;

    @Override
    public HandlerList getHandlers() {
        return null;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public MobKillEvent(Player player, Mob mob) {
        this.player = player;
        this.mob = mob;
    }

    public Player getPlayer() {
        return player;
    }

    public Mob getMob() {
        return mob;
    }
}
