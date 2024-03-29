package com.liboru.design.pattern.observer.eventbus.guava;

import com.google.common.eventbus.Subscribe;

/**
 * 消息监听
 */
public class MessageConsumer {

    @Subscribe
    public void consumeParent(MessageParent messageParent) {
        System.out.println("consumeParent 消费了消息，内容为：" + messageParent.getContent());
    }

    @Subscribe
    public void consume(Message message) {
        System.out.println("consume 消费了消息，内容为：" + message.getContent());
    }

}
