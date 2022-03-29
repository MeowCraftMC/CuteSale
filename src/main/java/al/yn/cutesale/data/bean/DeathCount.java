package al.yn.cutesale.data.bean;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class DeathCount extends BeanBase {
    public Map<UUID, Integer> deaths = new HashMap<>();
}
