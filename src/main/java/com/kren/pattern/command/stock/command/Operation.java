package com.kren.pattern.command.stock.command;

import com.kren.pattern.command.stock.Stock;

import java.util.function.Function;

public abstract class Operation {
    final Stock stock;

    Operation(Stock stock) {
        this.stock = stock;
    }

    abstract public void execute();

    public static enum Type {
        SELL_STOCK(stock -> new SellStock(stock)),
        
        BUY_STOCK(stock -> new BuyStock(stock));
        
        private Function<Stock, Operation> operationCreator;

        private Type(Function<Stock, Operation> operationCreator) {
            this.operationCreator = operationCreator;
        }

        public Operation getOperation(Stock stock) {
            return this.operationCreator.apply(stock);
        }
    }
}
