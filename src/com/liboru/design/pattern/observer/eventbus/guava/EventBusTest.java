package com.liboru.design.pattern.observer.eventbus.guava;

import com.google.common.eventbus.EventBus;

public class EventBusTest {

    public static void main(String[] args) throws InterruptedException {

        EventBus eventBus = new EventBus("test");
        eventBus.register(new MessageListener());
        eventBus.register(new MessageConsumer());
        System.out.println("register success");
        Thread.sleep(1000);
        eventBus.post(new Message("消息"));

    }

}
