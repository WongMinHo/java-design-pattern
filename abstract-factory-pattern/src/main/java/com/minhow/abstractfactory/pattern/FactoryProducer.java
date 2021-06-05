package com.minhow.abstractfactory.pattern;

/**
 * @author : MinHow
 * 工厂生成器
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if ("SHAPE".equalsIgnoreCase(choice)) {
            return new ShapeFactory();
        } else if ("COLOR".equalsIgnoreCase(choice)) {
            return new ColorFactory();
        }

        return null;
    }
}
