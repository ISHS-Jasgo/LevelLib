package com.github.jasgo.levellib.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class LLPlayerLevelChangeEvent extends Event {

    public static HandlerList HANDLERS = new HandlerList();
    private final Player player;
    private final int oldLevel;
    private final int newLevel;

    @Override
    public HandlerList getHandlers() {
        return null;
    }
    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
    public LLPlayerLevelChangeEvent(Player player, int oldLevel, int newLevel) {
        this.player = player;
        this.oldLevel = oldLevel;
        this.newLevel = newLevel;
    }

    public Player getPlayer() {
        return player;
    }

    public int getOldLevel() {
        return oldLevel;
    }

    public int getNewLevel() {
        return newLevel;
    }
}
