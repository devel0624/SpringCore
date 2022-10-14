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

    public void init(){
        System.out.println(this.getClassName() + " call init Method");
    }

    public void destroy(){
        System.out.println(this.getClassName() + " call destroy Method");
    }

//    @Override
//    public boolean sendMessage(User user, String message) {
//        System.out.printf("Arrived Message from %s , \"%s\" \n",user.getEmail(),message);
//        return false;
//    }

    public String getClassName(){
        return this.getClass().getSimpleName();
    }
}
