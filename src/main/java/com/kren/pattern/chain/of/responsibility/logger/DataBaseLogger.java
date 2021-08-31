package com.kren.pattern.chain.of.responsibility.logger;

import com.kren.pattern.chain.of.responsibility.logger.level.LogLevel;

public class DataBaseLogger extends ChainLogger {

    public DataBaseLogger(LogLevel level) {
        super(DataBaseLogger.class.getName(), level);
    }

    @Override
    void log(String message) {
        writeInDataBaseStub(message);
    }

    private void writeInDataBaseStub(String message) {
        System.out.println(loggerClassName + "[" + loggerLevel + "] " + message);
    }
}
