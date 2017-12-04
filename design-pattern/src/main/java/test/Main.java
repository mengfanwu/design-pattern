package test;

/**
 * Created by mengfw on 2017/8/23.
 */
public class Main {
    class Inner{

    }
    static class StaticInner{

    }

    public static void main(String[] args) {
        Inner inner = new Main().new Inner();
        StaticInner staticInner = new StaticInner();

    }

}
