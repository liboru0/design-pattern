package com.liboru.design.pattern.observer.eventbus.mine;

import java.util.concurrent.Executor;

public enum DirectExecutor implements Executor {
    INSTANCE;

    private DirectExecutor() {
    }

    @Override
    public void execute(Runnable command) {
        command.run();
    }

    @Override
    public String toString() {
        return "DirectExecutor";
    }
}
