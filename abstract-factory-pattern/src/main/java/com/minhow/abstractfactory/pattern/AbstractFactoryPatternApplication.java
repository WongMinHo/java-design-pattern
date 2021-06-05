package com.minhow.abstractfactory.pattern;

/**
 * @author : MinHow
 * 抽象工厂模式
 */
public class AbstractFactoryPatternApplication {

	public static void main(String[] args) {
		//获取形状工厂
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

		// 获取 Circle 对象
		Shape circleShape = shapeFactory.getShape("CIRCLE");
		circleShape.draw();

		// 获取 Square 对象
		Shape squareShape = shapeFactory.getShape("SQUARE");
		squareShape.draw();

		// 获取 Rectangle 对象
		Shape rectangleShape = shapeFactory.getShape("RECTANGLE");
		rectangleShape.draw();

		//获取颜色工厂
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

		// 获取 Circle 对象
		Color redColor = colorFactory.getColor("RED");
		redColor.fill();

		// 获取 Square 对象
		Color greenColor = colorFactory.getColor("GREEN");
		greenColor.fill();

		// 获取 Rectangle 对象
		Color blueColor = colorFactory.getColor("BLUE");
		blueColor.fill();
	}

}
