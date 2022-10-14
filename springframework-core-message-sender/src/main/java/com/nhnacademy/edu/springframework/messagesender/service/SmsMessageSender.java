package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.beans.factory.DisposableBean;

public class SmsMessageSender implements MessageSender {

    public SmsMessageSender() {
        System.out.println(this.getClassName() + "'s Constructor");
    }

    public void init(){
        System.out.println(this.getClassName() + " call init Method");
    }

    public void destroy(){
        System.out.println(this.getClassName() + " call destroy Method");
    }

    @Override
    public boolean sendMessage() {
        System.out.println("Send SMS");
        return false;
    }

//    @Override
//    public boolean sendMessage(User user, String message) {
//        System.out.printf("Arrived Message from %s , \"%s\" \n",user.getPhoneNumber(),message);
//        return false;
//    }

    public String getClassName(){
        return this.getClass().getSimpleName();
    }
}
