package com.minhow.singleton.pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : MinHow
 * 单例模式
 */
@Slf4j
public class Singleton {
    //让构造函数为 private，该类不会被实例化
    private Singleton() {
    }

    private static class SingletonHolder {
        private static Singleton instance = new Singleton();
    }
    //获取唯一可用的对象
    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }
    public void msg() {
        log.info("Singleton Pattern");
    }
}
