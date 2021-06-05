package com.minhow.factory.pattern;

/**
 * @author : MinHow
 * 形状工厂类
 */
public class ShapeFactory {
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
}
