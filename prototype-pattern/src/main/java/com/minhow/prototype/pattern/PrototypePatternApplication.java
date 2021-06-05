package com.minhow.prototype.pattern;

/**
 * @author : MinHow
 * 原型模式
 */
public class PrototypePatternApplication {

	public static void main(String[] args) {
		ProtoTypeManager protoTypeManager = new ProtoTypeManager();
		Shape circle = protoTypeManager.getShape("Circle");
		circle.countArea();

		Shape square = protoTypeManager.getShape("Square");
		square.countArea();
	}

}
