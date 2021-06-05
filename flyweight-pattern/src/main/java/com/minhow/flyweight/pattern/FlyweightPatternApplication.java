package com.minhow.flyweight.pattern;

/**
 * @author : MinHow
 * 享元模式
 */
public class FlyweightPatternApplication {

    public static void main(String[] args) {
        int extrinsic = 4;

        Flyweight flyweightX = FlyweightFactory.getFlyweight("X");
        flyweightX.operate(++ extrinsic);

        Flyweight flyweightY = FlyweightFactory.getFlyweight("Y");
        flyweightY.operate(++ extrinsic);

        Flyweight flyweightZ = FlyweightFactory.getFlyweight("Z");
        flyweightZ.operate(++ extrinsic);

        Flyweight flyweightReX = FlyweightFactory.getFlyweight("X");
        flyweightReX.operate(++ extrinsic);

        Flyweight unsharedConcreteFlyweight = new UnsharedConcreteFlyweight("X");
        unsharedConcreteFlyweight.operate(++ extrinsic);
    }

}
