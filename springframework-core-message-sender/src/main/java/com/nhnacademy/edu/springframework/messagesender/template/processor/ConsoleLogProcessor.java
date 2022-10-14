package com.nhnacademy.edu.springframework.messagesender.template.processor;

public class ConsoleLogProcessor extends AbstractProcessor{
    @Override
    protected void preProcess() {
        System.out.println("Pre Processing");
    }

    @Override
    protected void mainProcess() {
        System.out.println("Main Processing");
    }

    @Override
    protected void postProcess() {
        System.out.println("Post Processing");
    }
}
