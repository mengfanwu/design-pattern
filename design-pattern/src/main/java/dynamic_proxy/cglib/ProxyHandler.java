package dynamic_proxy.cglib;

import com.google.common.base.Joiner;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by mengfw on 2017/8/15.
 */
public class ProxyHandler implements MethodInterceptor {
    private Enhancer enhancer = new Enhancer();
    public Object getProxy(Class superClass){
        enhancer.setSuperclass(superClass);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before invoke... method:"+method.getName() + "  args:" + Joiner.on("-").join(objects));
        return methodProxy.invokeSuper(o,objects);
//        return method.invoke(o,objects);
    }
}
