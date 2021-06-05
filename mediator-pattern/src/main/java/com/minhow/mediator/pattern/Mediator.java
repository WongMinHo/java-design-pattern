package com.minhow.mediator.pattern;

/**
 * @author : MinHow
 * 抽象中介者
 */
public abstract class Mediator {
    //抽象发送消息方法
    public abstract void send(String message, Colleague colleague);
}
