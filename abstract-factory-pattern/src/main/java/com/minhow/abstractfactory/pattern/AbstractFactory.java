package com.minhow.abstractfactory.pattern;

/**
 * @author : MinHow
 * 抽象类
 */
public abstract class AbstractFactory {
    /**
     * 获取颜色
     * @param color
     * @return
     */
    public abstract Color getColor(String color);

    /**
     * 获取形状
     * @param shape
     * @return
     */
    public abstract Shape getShape(String shape) ;
}
