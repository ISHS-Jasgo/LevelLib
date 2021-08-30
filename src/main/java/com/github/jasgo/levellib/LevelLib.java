package com.github.jasgo.levellib;

import com.github.jasgo.levellib.event.LLPlayerLevelChangeEvent;
import com.github.jasgo.levellib.mobs.Mob;
import com.github.jasgo.levellib.util.LevelUtil;
import org.bukkit.plugin.java.JavaPlugin;

public final class LevelLib extends JavaPlugin {

    public static LLPlayerLevelChangeEvent llPlayerLevelChangeEvent;
    public static LevelUtil levelUtil;
    public static Mob mob;

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
