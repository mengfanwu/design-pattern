package provider_consumer;

import java.io.Serializable;

/**
 * Created by mengfw on 2017/11/27.
 */
public class DataBox implements Serializable {
    private int number;

    public DataBox(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
