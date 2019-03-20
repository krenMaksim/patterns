package com.kren.pattern.command.stock.command;

import com.kren.pattern.command.stock.Stock;

class SellStock extends Operation {

    public SellStock(Stock stock) {
        super(stock);
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
