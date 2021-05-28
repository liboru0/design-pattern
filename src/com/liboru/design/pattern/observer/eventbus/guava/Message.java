package com.liboru.design.pattern.observer.eventbus.guava;

/**
 * 消息类
 */
public class Message {

    /**
     * 消息对应的内容
     */
    private String content;

    public Message(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

}
