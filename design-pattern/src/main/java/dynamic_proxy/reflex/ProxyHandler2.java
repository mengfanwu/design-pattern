package dynamic_proxy.reflex;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by mengfw on 2017/8/14.
 */
public class ProxyHandler2 implements InvocationHandler{
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        return invoke(method.getName(),args);
    }
    private Object invoke(String methodName,Object[]args){
        if("add".equals(methodName)){
            System.out.println("equal add");
            long result = (Long) args[0] + (Long) args[1];
            return result;
        }
        return null;
    }
}
