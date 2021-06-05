package com.minhow.builder.pattern;

/**
 * @author : MinHow
 *
 */
public class Director {
    private Builder builder = new ConcreteBuilder();
    public Product getBMWProduct() {
        builder.setPart("宝马汽车", "X8");
        return builder.getProduct();
    }
    public Product getADProduct() {
        builder.setPart("奥迪汽车", "Q7");
        return builder.getProduct();
    }
}
