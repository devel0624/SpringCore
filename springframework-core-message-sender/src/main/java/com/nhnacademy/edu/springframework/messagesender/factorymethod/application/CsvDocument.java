package com.nhnacademy.edu.springframework.messagesender.factorymethod.application;

import com.nhnacademy.edu.springframework.messagesender.factorymethod.framework.Document;

public class CsvDocument extends Document {
    @Override
    public void open() {
        System.out.println(this.getClass().getSimpleName() + " Open");
    }
}
