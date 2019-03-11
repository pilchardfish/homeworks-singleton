package cn.edu.ncut.lab.singleton.lazy;

/**
 * Created by IntelliJ IDEA.
 * User: pilchard
 * Date: 2019-03-11
 * Time: 13:26
 * To change this template use File | Settings | File Templates.
 */
public class SimpleLazy {
    private static SimpleLazy instance=null;
    private SimpleLazy(){

    }
    public static SimpleLazy getInstance(){
        if(instance==null);
         instance=new SimpleLazy();
         return instance;
    }

}
