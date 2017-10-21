package ru.svin19.educ.educ07;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;
import java.util.HashMap;

import static java.lang.ClassLoader.getSystemClassLoader;
@Cache
public class Cached implements InvocationHandler {
    private final Object delegate;

    private HashMap someCache = new HashMap<Double, Double>();

    public Cached(Object delegate) {
        this.delegate = delegate;
    }
    public static <T> T isCached(Object delegate) {
        return (T) Proxy.newProxyInstance(
                getSystemClassLoader(),
                delegate.getClass().getInterfaces(),
                new Cached(delegate)
        );
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] arg) throws Throwable {
        Cache annotation = method.getAnnotation(Cache.class);
        int i = annotation.expireInSec();
        Date creationTime = new Date();
        if (someCache.containsKey(arg[0])) {
            System.out.println("Cached detected:" + someCache.get(arg[0]));
            return someCache.get(arg[0]);
        }
        Object result = method.invoke(delegate, arg[0]);
        someCache.put(arg[0], result);
        return result;

    }
}


