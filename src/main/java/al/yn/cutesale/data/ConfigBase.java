package al.yn.cutesale.data;

import al.yn.cutesale.CuteSale;
import com.electronwill.nightconfig.core.file.FileConfig;

import java.io.File;

public class ConfigBase {
    protected FileConfig configFile(String name) {
        var configFile = new File(CuteSale.INSTANCE.getDataFolder(), name);
        return FileConfig.builder(configFile).autosave().autoreload().build();
    }

    protected boolean isBoolean(Object o) {
        return o.toString().equalsIgnoreCase("true")
                || o.toString().equalsIgnoreCase("false");
    }
}
