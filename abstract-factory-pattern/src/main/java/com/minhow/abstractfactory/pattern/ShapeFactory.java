package com.minhow.abstractfactory.pattern;

/**
 * @author : MinHow
 * 形状工厂类
 */
public class ShapeFactory extends AbstractFactory {
    public Shape getShape(String type) {
        if ("CIRCLE".equalsIgnoreCase(type)) {
            return new Circle();
        } else if ("RECTANGLE".equalsIgnoreCase(type)) {
            return new Rectangle();
        } else if ("SQUARE".equalsIgnoreCase(type)) {
            return new Square();
        }

        return null;
    }

    public Color getColor(String color) {
        return null;
    }
}
