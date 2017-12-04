package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by mengfw on 2017/11/27.
 */
public class Subscribe implements Observer {
    public Subscribe(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("publish");
    }
}
