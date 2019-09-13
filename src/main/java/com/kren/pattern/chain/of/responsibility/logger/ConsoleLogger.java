package com.kren.pattern.chain.of.responsibility.logger;

import com.kren.pattern.chain.of.responsibility.logger.level.LogLevel;

public class ConsoleLogger extends ChainLogger {
    public ConsoleLogger(LogLevel level) {
        super(ConsoleLogger.class.getName(), level);
    }

    @Override
    void log(String message) {
        System.out.println(loggerClassName + "[" + loggerLevel + "] " + message);
    }
}
