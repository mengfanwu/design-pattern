package template;

/**
 * Created by mengfw on 2017/12/4.
 */
public class FoodieCoder extends AbstractCoder{

    @Override
    protected void goHome() {
        System.out.println("开车回家");
    }

    @Override
    protected void haveDinner() {
        System.out.println("吃各种美食");
    }

    @Override
    protected void play() {
        System.out.println("研究美食");
    }

    @Override
    protected void coding() {
        System.out.println("人生苦短，远离coding");
    }
}
