package com.kren.pattern.chain.of.responsibility;

import com.kren.pattern.chain.of.responsibility.logger.ChainLogger;
import com.kren.pattern.chain.of.responsibility.logger.ConsoleLogger;
import com.kren.pattern.chain.of.responsibility.logger.DataBaseLogger;
import com.kren.pattern.chain.of.responsibility.logger.FileLogger;
import com.kren.pattern.chain.of.responsibility.logger.level.LogLevel;

public class ChainResponsibilityMain {

    public static void main(String[] args) {
        ChainLogger logger = new ConsoleLogger(LogLevel.INFO);

        logger.chainNext(new FileLogger(LogLevel.DEBUG))
              .chainNext(new DataBaseLogger(LogLevel.ERROR));
        
        logger.log(LogLevel.ERROR, "errorMessage");
        System.out.println();
        logger.log(LogLevel.INFO, "infoMessage");
        System.out.println();
        logger.log(LogLevel.DEBUG, "debugMessage");
    }
}
