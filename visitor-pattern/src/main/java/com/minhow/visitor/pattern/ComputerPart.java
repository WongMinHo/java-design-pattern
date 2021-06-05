package com.minhow.visitor.pattern;

/**
 * @author : MinHow
 * 元素接口
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
