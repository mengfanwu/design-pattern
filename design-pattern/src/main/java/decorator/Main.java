package decorator;

/**
 * Created by mengfw on 2017/12/1.
 */
public class Main {
    public static void main(String[] args) {
        Worker worker = new Coder();
        Worker decorator = new PlayerCoder(new DrinkerCoder(worker));
        decorator.workOvertime();

    }
}
