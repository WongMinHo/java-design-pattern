package com.minhow.facade.pattern;

/**
 * @author : MinHow
 * 外观模式
 */
public class FacadePatternApplication {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();

    }

}
