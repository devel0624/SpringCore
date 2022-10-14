package com.nhnacademy.edu.springframework.messagesender.factorymethod.application;

import com.nhnacademy.edu.springframework.messagesender.factorymethod.framework.Application;

public class Main {
    public static void main(String[] args) {
        Application csvApplication = new CsvApplication();
        csvApplication.openDocument();
    }
}
