package com.liboru.design.pattern.observer.eventbus.mine.test;

import com.liboru.design.pattern.observer.eventbus.mine.Subscribe;

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
