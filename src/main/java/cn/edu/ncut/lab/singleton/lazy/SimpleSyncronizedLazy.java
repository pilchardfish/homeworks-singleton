package cn.edu.ncut.lab.singleton.lazy;

/**
 * Created by IntelliJ IDEA.
 * User: pilchard
 * Date: 2019-03-11
 * Time: 13:41
 * To change this template use File | Settings | File Templates.
 */
public class SimpleSyncronizedLazy {
    private static SimpleSyncronizedLazy instance=null;
    private SimpleSyncronizedLazy(){

    }
    public static synchronized SimpleSyncronizedLazy getInstance(){
        if(instance==null)
            instance=new SimpleSyncronizedLazy();
        return instance;
    }
}
