package com.liboru.design.pattern.observer.eventbus.mine.test;

import com.liboru.design.pattern.observer.eventbus.mine.Subscribe;

/**
 * 消息监听
 */
public class MessageListener {

    @Subscribe
    public void dealParent(MessageParent messageParent) {
        System.out.println("dealParent 收到消息，内容为：" + messageParent.getContent());
    }

}
