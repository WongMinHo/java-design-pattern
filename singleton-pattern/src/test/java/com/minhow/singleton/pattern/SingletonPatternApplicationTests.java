package com.minhow.singleton.pattern;

import org.junit.jupiter.api.Test;

class SingletonPatternApplicationTests {

    @Test
    void contextLoads() {
        //获取可用的对象
        Singleton singleton = Singleton.getInstance();
        //输出信息
        singleton.msg();
    }

}
