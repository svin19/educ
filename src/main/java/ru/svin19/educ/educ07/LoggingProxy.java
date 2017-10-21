package ru.svin19.educ.educ07;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import static java.lang.ClassLoader.getSystemClassLoader;
import static java.lang.reflect.Proxy.newProxyInstance;

public class LoggingProxy implements InvocationHandler {
    private final Object delegate;

    private LoggingProxy(Object delegate) {
        this.delegate = delegate;
    }

    public static <T> T withLoggingProxy(Object delegate) {
        return (T) newProxyInstance(
                getSystemClassLoader(),
                delegate.getClass().getInterfaces(),
                new LoggingProxy(delegate)
        );
    }

    @Override
    public Object invoke(Object proxy, Method method, Object args[]) throws Throwable {
        System.out.println("input ");
        if (args != null) {
            for (Object arg : args) {
                System.out.println(arg + ",");
            }
            System.out.println();
        }
        Object result = method.invoke(delegate, args);
        return null;

    }

}
