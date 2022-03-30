package al.yn.cutesale.listener;

import al.yn.cutesale.CuteSale;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerDeathListener implements Listener {
    @EventHandler
    public static void onPlayerDeath(PlayerDeathEvent event) {
        CuteSale.INSTANCE.getData().addDeathCountForPlayer(
                event.getEntity().getUniqueId());
    }
}
