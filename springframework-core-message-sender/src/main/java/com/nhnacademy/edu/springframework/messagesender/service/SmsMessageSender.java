package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;

public class SmsMessageSender implements MessageSender{
    public boolean sendMessage() {
        System.out.println("Send SMS");
        return false;
    }

    @Override
    public boolean sendMessage(User user, String message) {
        System.out.printf("Arrived Message from %s , \"%s\" \n",user.getPhoneNumber(),message);
        return false;
    }
}
