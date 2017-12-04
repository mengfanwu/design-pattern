package decorator;

/**
 * Created by mengfw on 2017/12/1.
 */
public class CoderDecorator implements Worker{
    private Worker worker;

    public CoderDecorator(Worker worker) {
        this.worker = worker;
    }

    @Override
    public void goHome() {
        worker.goHome();
    }

    @Override
    public void workOvertime() {
        worker.workOvertime();
    }
}
