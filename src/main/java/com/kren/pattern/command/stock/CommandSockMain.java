package com.kren.pattern.command.stock;

import com.kren.pattern.command.stock.command.Operation;

class CommandSockMain {

    public static void main(String[] args) {
        Stock stock = new Stock("TEST", 50);

        Operation sellStock = Operation.Type.SELL_STOCK.getOperation(stock);
        Operation buyStock = Operation.Type.BUY_STOCK.getOperation(stock);

        Brocker brocker = new Brocker();
        brocker.addOperation(buyStock);
        brocker.addOperation(sellStock);
        brocker.accomplishAll();
    }
}
