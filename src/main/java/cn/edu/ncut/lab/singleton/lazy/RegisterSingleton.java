package cn.edu.ncut.lab.singleton.lazy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by IntelliJ IDEA.
 * User: pilchard
 * Date: 2019-03-11
 * Time: 14:16
 * To change this template use File | Settings | File Templates.
 */
public class RegisterSingleton {
    private static Map<String ,Object>ioc=new ConcurrentHashMap<>();
    private RegisterSingleton(){

    }
    public static Object getBean(String name){
        synchronized (ioc) {
            if (!ioc.containsKey(name)) {
                Object obj = null;
                try {
                    obj = Class.forName(name).newInstance();
                    ioc.put(name, obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;
            } else {
                return ioc.get(name);
            }
        }
    }
}
