package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;

public interface MessageSender {

//    User class 추가 전 sendMessage 메소드
    boolean sendMessage();
//    boolean sendMessage(User user,String message);
}
