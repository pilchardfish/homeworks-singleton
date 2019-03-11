package cn.edu.ncut.lab.singleton.lazy;

/**
 * Created by IntelliJ IDEA.
 * User: pilchard
 * Date: 2019-03-11
 * Time: 13:43
 * To change this template use File | Settings | File Templates.
 */
public class SimpleDCLLazy {
    private static volatile SimpleDCLLazy instance=null;
    private SimpleDCLLazy(){

    }
    public static SimpleDCLLazy getInstance(){
        if(instance==null)
            synchronized (SimpleDCLLazy.class){
              if(instance==null)
                  instance=new SimpleDCLLazy();
            }
       return instance;
    }
}
