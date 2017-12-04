package decorator;

/**
 * Created by mengfw on 2017/12/1.
 */
public class DrinkerCoder extends CoderDecorator{
    private Worker worker;

    public DrinkerCoder(Worker worker) {
        super(worker);
        this.worker = worker;
    }

    @Override
    public void goHome() {
        worker.goHome();
        System.out.println("小酒喝起来");
    }
}
