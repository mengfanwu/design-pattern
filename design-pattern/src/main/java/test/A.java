package test;

import com.alibaba.fastjson.JSONArray;

import java.util.Map;
import java.util.concurrent.locks.LockSupport;

/**
 * Created by mengfw on 2017/11/28.
 */
public class A {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = Thread.currentThread();
        System.out.println("a");
        new Thread(()->{
            try {
                System.out.println("sleep");
                Thread.sleep(3000);
                Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
                for (Map.Entry<Thread, StackTraceElement[]> stackTrace : allStackTraces.entrySet()){
                    Thread t = (Thread) stackTrace.getKey();
                    StackTraceElement[] stack = (StackTraceElement[]) stackTrace.getValue();
                    if (t.equals(Thread.currentThread())) {
                        continue;
                    }
                    System.out.println("线程：" + t.getName());
                    for (StackTraceElement stackTraceElement : stack) {
                        System.out.println(stackTraceElement);
                    }
                }
                System.out.println("end sleep");

                LockSupport.unpark(thread);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        LockSupport.park();// 获取许可
        System.out.println("b");
    }
}
