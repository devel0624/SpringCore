package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.service.EmailMessageSender;

public class ComplexMessageSenderService {

    //메소드 내에서 객체 생성 후 사용
    public boolean doSendMessage(){
        return new EmailMessageSender().sendMessage();
    }
}
