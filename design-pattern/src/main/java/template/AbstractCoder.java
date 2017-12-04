package template;

/**
 * Created by mengfw on 2017/12/4.
 */
public abstract class AbstractCoder {
    public void goOffWork(){
        goHome();
        haveDinner();
        play();
        coding();
        sleep();
    }
    protected abstract void goHome();
    protected abstract void haveDinner();
    protected abstract void play();
    protected void coding(){
        System.out.println("继续coding");
    }
    protected void sleep(){
        System.out.println("sleep");
    }

}
