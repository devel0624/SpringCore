package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;

public class EmailMessageSender implements MessageSender{
    public EmailMessageSender() {
        System.out.println(this.getClass().getSimpleName() + "'s Constructor");
    }
    @Override
    public boolean sendMessage() {
        System.out.println("Send Email");
        return false;
    }

//    @Override
//    public boolean sendMessage(User user, String message) {
//        System.out.printf("Arrived Message from %s , \"%s\" \n",user.getEmail(),message);
//        return false;
//    }
}
