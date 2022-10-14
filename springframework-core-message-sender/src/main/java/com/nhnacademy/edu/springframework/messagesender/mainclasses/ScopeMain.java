package com.nhnacademy.edu.springframework.messagesender.mainclasses;

import com.nhnacademy.edu.springframework.messagesender.MessageSendService;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeMain {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
            "beans.xml")) {

            System.out.println("------------------------------------------------------------------------");
            new MessageSendService(context.getBean("emailMessageSender", MessageSender.class)).doSendMessage();
            System.out.println("------------------------------------------------------------------------");
            new MessageSendService(context.getBean("emailMessageSender", MessageSender.class)).doSendMessage();
            System.out.println("------------------------------------------------------------------------");
            new MessageSendService(context.getBean("smsMessageSender", MessageSender.class)).doSendMessage();
            System.out.println("------------------------------------------------------------------------");
            new MessageSendService(context.getBean("smsMessageSender", MessageSender.class)).doSendMessage();
            System.out.println("------------------------------------------------------------------------");
        }
    }
}
