package cn.edu.ncut.lab.singleton.lazy;

/**
 * Created by IntelliJ IDEA.
 * User: pilchard
 * Date: 2019-03-11
 * Time: 13:50
 * To change this template use File | Settings | File Templates.
 */
public class InnerLazy {
    public static final   InnerLazy getInstance(){
        return InnerLazyHolder.instance;
    }
    private InnerLazy(){
           if(InnerLazyHolder.instance!=null)
               throw new RuntimeException("单例被破坏！");
    }
    private static  class InnerLazyHolder{
        private final static InnerLazy instance=new InnerLazy();

    }
}
