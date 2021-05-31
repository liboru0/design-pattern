package com.liboru.design.pattern.observer.eventbus.mine.test;

import com.liboru.design.pattern.observer.eventbus.mine.EventBus;

public class EventBusTest {

    public static void main(String[] args) throws InterruptedException {

        EventBus eventBus = new EventBus();
        eventBus.register(new MessageListener());
        eventBus.register(new MessageConsumer());
        System.out.println("register success");
        System.out.println("-----------------");
        Thread.sleep(1000);
        eventBus.post(new Message("message消息"));
        System.out.println("-----------------");
        Thread.sleep(1000);
        eventBus.post(new MessageParent("messageParent消息"));

    }

}
