package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.User;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;

public class MessageSendService {
    private MessageSender messageSender; // final 키워드는 생성 이후 재할당이 불가능하기 때문에 삭제

    public MessageSendService(){
        // 기본 생성자 필요, 기본 생성자만 존재하면 생략 가능
    }

    public void setMessageSender(MessageSender messageSender) {
        System.out.println("set Message Sender in MessageSend Service");
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

