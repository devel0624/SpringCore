package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;

public class MessageSendService {
    private final MessageSender messageSender;
    public MessageSendService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }
    public boolean doSendMessage(){
        return messageSender.sendMessage(new User("test@example.org","010-XXXX-XXXX"),"Just Message");
    }
}

