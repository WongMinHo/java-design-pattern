package com.minhow.singleton.pattern;



/**
 * @author : MinHow
 * 单例模式
 */
public class SingletonPatternApplication {

    public static void main(String[] args) {
        //获取可用的对象
        Singleton singleton = Singleton.getInstance();
        //输出信息
        singleton.msg();
    }

}
