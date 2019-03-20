package com.kren.pattern.proxy.loggingservice;

import com.kren.pattern.proxy.loggingservice.service.AnyService;
import com.kren.pattern.proxy.loggingservice.service.AnyServiceImpl;

import java.util.logging.Logger;

public class LoggingProxyAnyService implements AnyService {
    private static final Logger LOGGER = Logger.getLogger(LoggingProxyAnyService.class.getName());

    private final AnyService anyService;

    public LoggingProxyAnyService(AnyService anyService) {
        this.anyService = new AnyServiceImpl();
    }

    @Override
    public void doSomething() {
        LOGGER.info("start " + anyService.getClass()
                                         .getName());

        anyService.doSomething();

        LOGGER.info("end " + anyService.getClass()
                                       .getName());
    }
}
