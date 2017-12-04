package dynamic_proxy.reflex;

import com.google.common.base.Joiner;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by mengfw on 2017/8/14.
 */
public class ProxyHandler implements InvocationHandler {
    private Object object;

    public ProxyHandler(Object object) {
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before invoke ... methodName:" + method.getName() + " args: " + Joiner.on("-").join(args));
        Object result = method.invoke(object, args);
        System.out.println("after invoke ... result:" + result.toString());
        return result;
    }

}
