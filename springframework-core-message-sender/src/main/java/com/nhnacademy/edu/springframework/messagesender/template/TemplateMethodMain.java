package com.nhnacademy.edu.springframework.messagesender.template;

import com.nhnacademy.edu.springframework.messagesender.template.processor.AbstractProcessor;
import com.nhnacademy.edu.springframework.messagesender.template.processor.ConsoleLogProcessor;

public class TemplateMethodMain {
    public static void main(String[] args) {
        AbstractProcessor processor = new ConsoleLogProcessor();

        processor.process();
    }
}
