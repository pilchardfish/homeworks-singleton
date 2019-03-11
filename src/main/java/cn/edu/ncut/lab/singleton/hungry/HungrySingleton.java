package cn.edu.ncut.lab.singleton.hungry;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: pilchard
 * Date: 2019-03-11
 * Time: 11:52
 * To change this template use File | Settings | File Templates.
 */
public class HungrySingleton implements Serializable {
    private final static HungrySingleton INSTANCE=new HungrySingleton();
    private HungrySingleton(){

    }
    public static HungrySingleton getInstance(){
        return  INSTANCE;
    }
    public Object readResolve(){
        return INSTANCE;

    }
}
