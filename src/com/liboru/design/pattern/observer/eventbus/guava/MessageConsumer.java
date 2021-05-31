package com.liboru.design.pattern.observer.eventbus.guava;

import com.google.common.eventbus.Subscribe;

/**
 * 消息监听
 */
public class MessageConsumer {

    @Subscribe
    public void consume(Message message) {
        System.out.println("消费了消息，内容为：" + message.getContent());
    }

}
