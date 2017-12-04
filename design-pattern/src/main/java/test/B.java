package test;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by mengfw on 2017/11/28.
 */
public class B {
    static Lock lock = new ReentrantLock();
    static Condition c = lock.newCondition();
    public static void main(String[] args) throws InterruptedException {
        System.out.println("out begin");
        lock.lock();
        System.out.println("out locked ");
        new Thread(()->{
            try {
                System.out.println("inner begin");
                lock.lock();
                System.out.println("inner locked");
                Thread.sleep(3000);
                c.signal();
                lock.unlock();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        Thread.sleep(3000);
        c.await();
        System.out.println("out begin again");
        lock.unlock();

    }
}
