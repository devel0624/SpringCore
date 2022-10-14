package com.nhnacademy.edu.springframework.messagesender;

public class NonIocMain {
    public static void main(String[] args) {
        new ComplexMessageSenderService().doSendMessage();
    }
}
