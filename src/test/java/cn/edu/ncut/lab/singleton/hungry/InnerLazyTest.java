package cn.edu.ncut.lab.singleton.hungry;

import cn.edu.ncut.lab.singleton.lazy.InnerLazy;

/**
 * Created by IntelliJ IDEA.
 * User: pilchard
 * Date: 2019-03-11
 * Time: 14:38
 * To change this template use File | Settings | File Templates.
 */
public class InnerLazyTest {
    public static void main(String[] args) {
        InnerLazy innerLazy=InnerLazy.getInstance();
        System.out.println(innerLazy);
    }
}
