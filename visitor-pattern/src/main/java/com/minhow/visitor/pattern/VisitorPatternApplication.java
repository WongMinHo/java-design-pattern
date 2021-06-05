package com.minhow.visitor.pattern;

/**
 * @author : MinHow
 * 访问者模式
 */
public class VisitorPatternApplication {

    public static void main(String[] args) {
        ComputerPart computerPart = new Computer();
        computerPart.accept(new ComputerPartDisplayVisitor());
    }

}
