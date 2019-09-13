package com.kren.pattern.chain.of.responsibility.logger.level;

public enum LogLevel {
    INFO(1), DEBUG(2), ERROR(3);

    private int levelNumber;

    private LogLevel(int levelNumber) {
        this.levelNumber = levelNumber;
    }

    public boolean lessOrEqual(LogLevel level) {
        return this.levelNumber <= level.levelNumber;
    }
}
