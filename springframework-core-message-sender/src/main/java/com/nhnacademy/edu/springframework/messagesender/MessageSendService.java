package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.User;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class MessageSendService {

    private MessageSender messageSender;

    private List<MessageSender> messageSenders;

    public MessageSendService(){
        // 기본 생성자
    }

    public MessageSendService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    @Autowired
    public MessageSendService(List<MessageSender> messageSenders) {
        System.out.println("Autowired beans to Constructor ");
        this.messageSenders = messageSenders;
    }

    public void setMessageSender(
        MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void setSmsMessageSender(MessageSender messageSender) {
        System.out.println("Autowired");
        this.messageSender = messageSender;
    }

//    public boolean doSendMessage(){
//        return messageSender.sendMessage(new User("test@example.org","010-XXXX-XXXX"),"Just Message");
//    }

    public boolean doSendMessage(){
        return messageSender.sendMessage();
    }

    public void doSendMessages(){
        messageSenders.forEach(MessageSender::sendMessage);
    }
}

