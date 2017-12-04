package dynamic_proxy.cglib;

import org.junit.Test;

/**
 * Created by mengfw on 2017/8/15.
 */
public class Main {
    
    public static void main(String[] args) {
        Object proxy = new ProxyHandler().getProxy(Base.class);
        ((Base)proxy).doSomething();
    }
    @Test
    public void  test2(){
        Object proxy = new ProxyHandler2().getProxy(Bird.class);
        ((Bird) proxy).fly();
    }
}
