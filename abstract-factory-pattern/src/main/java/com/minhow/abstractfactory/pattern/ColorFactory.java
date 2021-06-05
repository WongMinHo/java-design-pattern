package com.minhow.abstractfactory.pattern;

/**
 * @author : MinHow
 * 颜色工厂类
 */
public class ColorFactory extends AbstractFactory {
    public Shape getShape(String type) {
        return null;
    }
    
    public Color getColor(String color) {
        if ("RED".equalsIgnoreCase(color)) {
            return new Red();
        } else if ("GREEN".equalsIgnoreCase(color)) {
            return new Green();
        } else if ("BLUE".equalsIgnoreCase(color)) {
            return new Blue();
        }
        return null;
    }
}
