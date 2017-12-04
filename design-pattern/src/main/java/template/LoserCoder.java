package template;

/**
 * Created by mengfw on 2017/12/4.
 */
public class LoserCoder extends AbstractCoder{
    @Override
    protected void goHome() {
        System.out.println("挤地铁回家");
    }

    @Override
    protected void haveDinner() {
        System.out.println("吃泡面");
    }

    @Override
    protected void play() {
        System.out.println("荣耀吃鸡");

    }

}
