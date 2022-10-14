package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.beans.factory.DisposableBean;

public class SmsMessageSender implements MessageSender, DisposableBean {

    public SmsMessageSender() {
        System.out.println(this.getClassName() + "'s Constructor");
    }

    public void init(){
        System.out.println(this.getClassName() + " call init Method");
    }

    @Override
    public void destroy() throws Exception {
        // org.springframework.beans.factory.DisposableBean 인터페이스, 객체 소멸시 호출
        // InitializingBean 과 마찬가지로 스프링 프레임워크에 의존성을 가지게 되어 권장하지 않음
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
