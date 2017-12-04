package observer;

import java.util.Observable;

/**
 * Created by mengfw on 2017/11/27.
 */
public class Publish extends Observable{

    public void publish(){
        this.setChanged();
        this.notifyObservers();
    }
}
