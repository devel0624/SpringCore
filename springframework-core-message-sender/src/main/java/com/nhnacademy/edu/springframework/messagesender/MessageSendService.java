package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.User;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import org.springframework.beans.factory.annotation.Required;

public class MessageSendService {
    private MessageSender messageSender;

    public MessageSendService(){
        // 기본 생성자
    }


//    public void setMessageSender(
//        MessageSender messageSender) {
//        this.messageSender = messageSender;
//    }
    @Required
    public void setSmsMessageSender(
            MessageSender messageSender) {
            this.messageSender = messageSender;
        }

    public MessageSendService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

//    public boolean doSendMessage(){
//        return messageSender.sendMessage(new User("test@example.org","010-XXXX-XXXX"),"Just Message");
//    }

    public boolean doSendMessage(){
        return messageSender.sendMessage();
    }
}

