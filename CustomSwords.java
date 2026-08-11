package me.poker.customswords;

import org.bukkit.plugin.java.JavaPlugin;

public final class Customswords extends JavaPlugin {

    private SwordManager swordManager;

    @Override
    public void onEnable() {
        saveDefaultConfig();

        this.swordManager = new SwordManager(this);

        AbilityListener abilityListener = new AbilityListener(this);
        CommandHandler commandHandler = new CommandHandler(this, abilityListener);

        getCommand("customsword").setExecutor(commandHandler);
        getCommand("customsword").setTabCompleter(commandHandler);

        getServer().getPluginManager().registerEvents(abilityListener, this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public SwordManager getSwordManager() {
        return swordManager;
    }
}
