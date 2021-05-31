package com.liboru.design.pattern.observer.eventbus.mine;

import java.util.List;
import java.util.concurrent.Executor;

public class EventBus {
    private Executor executor;
    private ObserverRegistry registry = new ObserverRegistry();

    public EventBus() {
        this(DirectExecutor.INSTANCE);
    }

    protected EventBus(Executor executor) {
        this.executor = executor;
    }

    public void register(Object object) {
        registry.register(object);
    }

    public void post(Object event) {
        List<ObserverAction> observerActions = registry.getMatchedObserverActions(event);
        for (ObserverAction observerAction : observerActions) {
            executor.execute(() -> observerAction.execute(event));
        }
    }
}