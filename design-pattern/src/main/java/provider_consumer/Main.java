package provider_consumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by mengfw on 2017/11/27.
 */
public class Main {
    public static void main(String[] args) {
        BlockingQueue<DataBox> queue = new LinkedBlockingQueue<>();
        new Thread(new Provider(queue)).start();
        new Thread(new Consumer(queue)).start();
    }
}
