package com.kren.pattern.command.stock.command;

import com.kren.pattern.command.stock.Stock;

class BuyStock extends Operation {

    public BuyStock(Stock stock) {
        super(stock);
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
