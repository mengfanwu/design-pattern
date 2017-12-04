package observer;

/**
 * Created by mengfw on 2017/11/27.
 */
public class Main {
    public static void main(String[] args) {
        Publish publish = new Publish();
        Subscribe subscribe = new Subscribe(publish);
        publish.publish();
    }
}
