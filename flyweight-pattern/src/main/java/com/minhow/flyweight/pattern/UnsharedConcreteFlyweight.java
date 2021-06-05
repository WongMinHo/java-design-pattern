package com.minhow.flyweight.pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : MinHow
 * 不需要共享的Flyweight子类
 */
@Slf4j
public class UnsharedConcreteFlyweight extends Flyweight {
    public UnsharedConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }
    @Override
    public void operate(int extrinsic) {
        log.info("不共享的具体Flyweight:" + extrinsic);
    }
}
