package al.yn.cutesale.command;

import dev.jorel.commandapi.annotations.Command;
import dev.jorel.commandapi.annotations.Default;
import dev.jorel.commandapi.annotations.Permission;
import org.bukkit.command.CommandSender;

@Command("cutesale")
@Permission("cutesale.use")
public class CuteSaleCommand {
    @Default
    public static void onCommand(CommandSender sender) {

    }
}
