package com.liboru.design.pattern.observer.eventbus.mine;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ObserverAction {
    private Object target;
    private Method method;

    public ObserverAction(Object target, Method method) {
        if (target == null) {
            throw new NullPointerException();
        }
        this.target = target;
        this.method = method;
        this.method.setAccessible(true);
    }

    /**
     * event是method方法的参数，即消息
     */
    public void execute(Object event) {
        try {
            method.invoke(target, event);
        } catch (InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}