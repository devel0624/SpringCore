package com.nhnacademy.edu.springframework.messagesender.mainclasses;

import com.nhnacademy.edu.springframework.messagesender.MessageSendService;
import com.nhnacademy.edu.springframework.messagesender.service.EmailMessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.SmsMessageSender;

public class MainClass {
    public static void main(String[] args) {
        new MessageSendService(new EmailMessageSender()).doSendMessage();
        new MessageSendService(new SmsMessageSender()).doSendMessage();
    }
}
