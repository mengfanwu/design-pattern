package provider_consumer;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by mengfw on 2017/11/27.
 */
public class Provider implements Runnable{

    private BlockingQueue<DataBox> queue;
    private AtomicInteger count = new AtomicInteger();

    public Provider(BlockingQueue<DataBox> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        Random r = new Random();
        try {
            while (true){
                Thread.sleep(r.nextInt(1000));
                int count = this.count.addAndGet(1);
                if(!queue.offer(new DataBox(count), 2, TimeUnit.SECONDS)){
                    System.err.println(Thread.currentThread().getName() +" : provide error : " + count);
                }else {
                    System.out.println(Thread.currentThread().getName() +" : provide success : " + count);
                }
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
