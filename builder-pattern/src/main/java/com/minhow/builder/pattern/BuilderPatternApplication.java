package com.minhow.builder.pattern;

/**
 * @author : MinHow
 * 建造者模式
 */
public class BuilderPatternApplication {

	public static void main(String[] args) {
        Director director = new Director();

        Product adProduct = director.getADProduct();
        adProduct.showProduct();

        Product bmwProduct = director.getBMWProduct();
        bmwProduct.showProduct();
    }

}
