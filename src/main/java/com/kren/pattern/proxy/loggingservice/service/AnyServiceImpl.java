package com.kren.pattern.proxy.loggingservice.service;

public class AnyServiceImpl implements AnyService {

    @Override
    public void doSomething() {
        System.out.println("do something");
    }
}
