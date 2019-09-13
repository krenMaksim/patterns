package com.kren.pattern.chain.of.responsibility.logger;

import com.kren.pattern.chain.of.responsibility.logger.level.LogLevel;

import java.util.Objects;

public abstract class ChainLogger {
    protected final String loggerClassName;
    protected final LogLevel loggerLevel;
    private ChainLogger next;

    ChainLogger(String loggerClassName, LogLevel loggerLevel) {
        this.loggerClassName = loggerClassName;
        this.loggerLevel = loggerLevel;
    }

    public void log(LogLevel messageLevel, String message) {
        if (loggerHasSuatebleLogLevel(messageLevel)) {
            log(message);
        }

        chainNextLoggerIfExist(messageLevel, message);
    }

    private boolean loggerHasSuatebleLogLevel(LogLevel messageLevel) {
        return loggerLevel.lessOrEqual(messageLevel);
    }

    private void chainNextLoggerIfExist(LogLevel messageLevel, String message) {
        if (existNextLogger()) {
            next.log(messageLevel, message);
        }
    }

    private boolean existNextLogger() {
        return Objects.nonNull(next);
    }

    public ChainLogger chainNext(ChainLogger next) {
        this.next = next;
        return next;
    }
    
    abstract void log(String message);
}
