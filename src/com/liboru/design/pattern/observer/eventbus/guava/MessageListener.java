package com.liboru.design.pattern.observer.eventbus.guava;

import com.google.common.eventbus.Subscribe;

/**
 * 消息监听
 */
public class MessageListener {

    @Subscribe
    public void dealParent(MessageParent messageParent) {
        System.out.println("dealParent 收到消息，内容为：" + messageParent.getContent());
    }

}
