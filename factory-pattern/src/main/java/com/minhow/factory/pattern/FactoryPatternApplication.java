package com.minhow.factory.pattern;

/**
 * @author : MinHow
 * 工厂模式
 */
public class FactoryPatternApplication {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // 获取 Circle 对象
        Shape circleShape = shapeFactory.getShape("CIRCLE");
        circleShape.draw();

        // 获取 Square 对象
        Shape squareShape = shapeFactory.getShape("SQUARE");
        squareShape.draw();

        // 获取 Rectangle 对象
        Shape rectangleShape = shapeFactory.getShape("RECTANGLE");
        rectangleShape.draw();
    }

}
