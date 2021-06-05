package com.minhow.strategy.pattern;

/**
 * @author : MinHow
 * 策略模式:
 */
public class Context {
    private Travel travel;

    public Context(Travel travel) {
        this.travel = travel;
    }

    /**
     * 出行
     * @return
     */
    public String goOn() {
        return this.travel.go();
    }
}
