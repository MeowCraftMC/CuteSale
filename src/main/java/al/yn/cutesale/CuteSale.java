package al.yn.cutesale;

import al.yn.cutesale.data.Config;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.annotation.dependency.Dependency;
import org.bukkit.plugin.java.annotation.dependency.DependsOn;
import org.bukkit.plugin.java.annotation.plugin.*;
import org.bukkit.plugin.java.annotation.plugin.author.Author;
import org.jetbrains.annotations.NotNull;

@Plugin(name = "CuteSale", version = "1.0.0")
@Description("Show your price.")
@Author("qyl27")
@LogPrefix("CuteSale")
@Website("https://github.com/MeowCraftMC/CuteSale")
@DependsOn(@Dependency("CommandAPI"))
@ApiVersion(ApiVersion.Target.v1_18)
public final class CuteSale extends JavaPlugin {
    public static CuteSale INSTANCE = null;

    private Config config = new Config();

    public CuteSale() {
        INSTANCE = this;
    }

    @NotNull
    public Config getBoardConfig() {
        return config;
    }

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
