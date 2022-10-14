package com.nhnacademy.edu.springframework.messagesender.mainclasses;

import com.nhnacademy.edu.springframework.messagesender.ComplexMessageSenderService;

public class NonIocMain {
    public static void main(String[] args) {
        new ComplexMessageSenderService().doSendMessage();
    }
}
