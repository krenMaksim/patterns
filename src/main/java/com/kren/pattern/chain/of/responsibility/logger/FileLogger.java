package com.kren.pattern.chain.of.responsibility.logger;

import com.kren.pattern.chain.of.responsibility.logger.level.LogLevel;

public class FileLogger extends ChainLogger {

    public FileLogger(LogLevel level) {
        super(FileLogger.class.getName(), level);
    }

    @Override
    void log(String message) {
        writeInFileStub(message);
    }

    private void writeInFileStub(String message) {
        System.out.println(loggerClassName + "[" + loggerLevel + "] " + message);
    }
}
