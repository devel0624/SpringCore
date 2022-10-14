package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.beans.factory.InitializingBean;

public class SmsMessageSender implements MessageSender, InitializingBean {

    public SmsMessageSender() {
        System.out.println(this.getClass().getSimpleName() + "'s Constructor");
    }

    @Override
    public boolean sendMessage() {
        System.out.println("Send SMS");
        return false;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // org.springframework.beans.factory.InitializingBean 인터페이스를 사용
        // 컴포넌트가 프레임워크에 대해 의존성을 가지기 때문에 권장하지 않음.
    }

//    @Override
//    public boolean sendMessage(User user, String message) {
//        System.out.printf("Arrived Message from %s , \"%s\" \n",user.getPhoneNumber(),message);
//        return false;
//    }
}
