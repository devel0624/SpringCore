package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;

public interface MessageSender {

//    boolean sendMessage(); 유저 추가 전 sendMessage 메소드;
    boolean sendMessage(User user,String message);
}
