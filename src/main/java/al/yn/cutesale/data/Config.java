package al.yn.cutesale.data;

import al.yn.cutesale.CuteSale;
import com.electronwill.nightconfig.core.ConfigSpec;
import com.electronwill.nightconfig.core.file.FileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import com.electronwill.nightconfig.toml.TomlWriter;
import com.sun.security.auth.login.ConfigFile;

import java.io.File;

public class Config extends ConfigBase {
    public boolean isEnableDeathCount = true;

    private FileConfig config = null;
    private ConfigSpec spec = null;
    private TomlWriter writer = null;

    public Config() {
        writer = new TomlWriter();

        config = configFile("config.toml");
        spec = spec();
        write();
        reload();
    }

    public void reload() {
        spec.correct(config);

        isEnableDeathCount = config.getOrElse("enableDeathCount", true);
    }

    private ConfigSpec spec() {
        spec = new ConfigSpec();

        spec.define("enableDeathCount", isEnableDeathCount, this::isBoolean);

        return spec;
    }

    public <T> void setValue(String path, T value) {
        config.set(path, value);

        spec.correct(config);

        write();
    }

    public void write() {
        writer.write(config, config.getFile(), WritingMode.REPLACE);
    }
}
