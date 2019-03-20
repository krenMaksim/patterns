package com.kren.pattern.proxy.loggingservice;

import com.kren.pattern.proxy.loggingservice.service.AnyService;
import com.kren.pattern.proxy.loggingservice.service.AnyServiceImpl;

public class LoggingProxyMain {

    public static void main(String[] args) {
        AnyService service = new LoggingProxyAnyService(new AnyServiceImpl());
        service.doSomething();
    }
}
