package com.nhnacademy.edu.springframework.messagesender.factorymethod.application;

import com.nhnacademy.edu.springframework.messagesender.factorymethod.framework.Application;
import com.nhnacademy.edu.springframework.messagesender.factorymethod.framework.Document;

public class CsvApplication extends Application {
    @Override
    protected Document createDocument() {
        return new CsvDocument();
    }
}
