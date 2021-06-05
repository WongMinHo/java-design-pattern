package com.minhow.flyweight.pattern;

/**
 * @author : MinHow
 * 享元抽象类
 */
public abstract class Flyweight {
    //内部状态
    public String intrinsic;
    //外部状态
    protected final String extrinsic;
    //要求享元角色必须接受外部状态
    public Flyweight(String extrinsic) {
        this.extrinsic = extrinsic;
    }
    //定义业务操作
    public abstract void operate(int extrinsic);

}
