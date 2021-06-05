package com.minhow.visitor.pattern;

/**
 * @author : MinHow
 */
public class Monitor implements ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
