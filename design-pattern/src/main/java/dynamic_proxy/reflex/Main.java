package dynamic_proxy.reflex;

import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * Created by mengfw on 2017/8/14.
 */
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new CalculatorImpl();
        Calculator calculatorProxy = (Calculator)Proxy.newProxyInstance(calculator.getClass().getClassLoader(), calculator.getClass().getInterfaces(), new ProxyHandler(calculator));
        long add = calculatorProxy.add(1, 2);
        System.out.println(add);
    }
    @Test
    public void test2(){
        Calculator calculatorProxy = (Calculator)Proxy.newProxyInstance(Calculator.class.getClassLoader(), new Class[]{Calculator.class}, new ProxyHandler2());
        long add = calculatorProxy.add(1, 2);
        System.out.println(add);
    }
}
