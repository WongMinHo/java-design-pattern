package com.minhow.flyweight.pattern;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;

/**
 * @author : MinHow
 * 享元工厂
 */
@Slf4j
public class FlyweightFactory {
    private static HashMap<String, Flyweight> pool = new HashMap<String, Flyweight>();

    public static Flyweight getFlyweight(String extrinsic) {
        Flyweight flyweight = null;

        if (pool.containsKey(extrinsic)) {
            flyweight = pool.get(extrinsic);
            log.info("已存在" + extrinsic + "，从池中取~");
        } else {
            flyweight = new ConcreteFlyweight(extrinsic);
            //放入池中
            pool.put(extrinsic, flyweight);
            log.info("创建" + extrinsic + "，并从池中取出~");
        }

        return flyweight;
    }
}
