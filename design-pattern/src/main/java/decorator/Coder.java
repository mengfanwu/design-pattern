package decorator;

/**
 * Created by mengfw on 2017/12/1.
 */
public class Coder implements Worker{
    @Override
    public void goHome() {
        System.out.println("苦逼程序员回家");
    }

    @Override
    public void workOvertime() {
        System.out.println("决战到天亮");
    }
}
