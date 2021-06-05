package com.minhow.command.pattern;


/**
 * @author : MinHow
 */
public class SellStock implements Order {
    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }
    public void execute() {
        stock.sell();
    }
}
