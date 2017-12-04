package provider_consumer;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Created by mengfw on 2017/11/27.
 */
public class Consumer implements Runnable {
    private BlockingQueue<DataBox> queue;
    public Consumer(BlockingQueue<DataBox> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        Random r = new Random();
        while (true){
            try {
                DataBox poll = queue.take();
                if(poll == null){
                    System.out.println(Thread.currentThread().getName()+" - consume error - null");
                }else {
                    System.out.println(Thread.currentThread().getName()+" - consume success - " + poll.getNumber());
                    Thread.sleep(r.nextInt(1000));
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
