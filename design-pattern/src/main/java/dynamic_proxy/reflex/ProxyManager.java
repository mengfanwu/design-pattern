package dynamic_proxy.reflex;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by mengfw on 2017/8/14.
 */
public class ProxyManager {
    private static ConcurrentHashMap<String,Object> map;
    static{
        map = new ConcurrentHashMap<String, Object>();

    }
}
