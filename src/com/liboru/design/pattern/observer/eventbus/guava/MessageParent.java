package com.liboru.design.pattern.observer.eventbus.guava;

/**
 * 消息类
 */
public class MessageParent {

    /**
     * 消息对应的内容
     */
    private String content;

    public MessageParent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

}
