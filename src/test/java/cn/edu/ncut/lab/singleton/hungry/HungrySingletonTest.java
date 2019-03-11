package cn.edu.ncut.lab.singleton.hungry;

import java.io.*;
import java.util.concurrent.CountDownLatch;

/**
 * Created by IntelliJ IDEA.
 * User: pilchard
 * Date: 2019-03-11
 * Time: 11:56
 * To change this template use File | Settings | File Templates.
 */
public class HungrySingletonTest {
    public static void main(String[] args) {
        int num = 10;
        CountDownLatch latch = new CountDownLatch(num);
        for (int i = 0; i < num; i++) {
            Thread thread = new Thread(() -> {
                try {
                    latch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                HungrySingleton singleton = HungrySingleton.getInstance();
                System.out.println(Thread.currentThread().getName() + ":" + singleton);
            });
            thread.start();
            latch.countDown();
        }
        try {
            OutputStream outputStream = new FileOutputStream(new File(HungrySingletonTest.class.getResource("").getPath()+ "obj"));
            ObjectOutputStream out = new ObjectOutputStream(outputStream);
            out.writeObject(HungrySingleton.getInstance());
            out.flush();
            out.close();
            InputStream inputStream = new FileInputStream(new File(HungrySingletonTest.class.getResource("").getPath()+ "obj"));
            ObjectInputStream in = new ObjectInputStream(inputStream);
            HungrySingleton singleton = (HungrySingleton) in.readObject();
            System.out.println("序列化："+singleton);
            in.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
