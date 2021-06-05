package com.minhow.visitor.pattern;

/**
 * @author : MinHow
 * 访问者接口
 */
public interface ComputerPartVisitor {
    void visit(Computer computer);
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
}
