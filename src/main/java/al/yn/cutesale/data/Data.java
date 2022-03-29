package al.yn.cutesale.data;

import al.yn.cutesale.CuteSale;
import al.yn.cutesale.data.bean.BeanBase;
import al.yn.cutesale.data.bean.DeathCount;
import com.google.gson.Gson;
import org.bukkit.util.FileUtil;

import java.io.File;
import java.nio.file.Files;
import java.util.UUID;

public class Data {
    public final File BASE_FILE = CuteSale.INSTANCE.getDataFolder();

    private Gson gson = null;

    private File deathCountFile = new File(BASE_FILE, "deathCounts");
    private DeathCount deathCount = new DeathCount();

    public Data() {
        gson = new Gson();

    }

    public void write(BeanBase bean, File file) {
        var json = gson.toJson(bean);

        try {
            Files.writeString(file.toPath(), json);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void setDeathCountForPlayer(UUID player, int count) {
        deathCount.deaths.put(player, count);

        write(deathCount, deathCountFile);
    }

    public void addDeathCountForPlayer(UUID player) {
        var count = 0;

        if (deathCount.deaths.containsKey(player)) {
            count = deathCount.deaths.get(player);
        }

        deathCount.deaths.put(player, count + 1);

        write(deathCount, deathCountFile);
    }
}
