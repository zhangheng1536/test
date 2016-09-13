import com.google.common.collect.Maps;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vivider on 2016/9/12.
 */
public class MapTest {
    public static void main(final String[] args) {
        final Map<String, Object> newMapMap = Maps.newHashMap();
        final Map<String, Map<String, Object>> newMsdapMap = new HashMap<String, Map<String, Object>>();
        final Map<String, String> newMap = null;
        newMap.put("sdf", "ssdfsd");
        newMap.put("sdasdf", "ssdsdfsdfsfsd");
        newMap.put("sdsdfsdff", "ssdfsdfssdfsdfsdfsdfssd");
        newMap.put("sdsdfsdfsdfsfdsf", "sssdfsdfsdfsdfssdfsdfsdfdfsdfsddfsd");
        newMap.put("ssdfsdfdf", "ssdfsd");
        newMapMap.put("Ssdfs", newMap);
        final Object obj = newMapMap.get("Ssdfs");
        System.out.print(newMap.get("Sdfsfd"));
    }
}
