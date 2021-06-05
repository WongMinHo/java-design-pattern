package com.minhow.flyweight.pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : MinHow
 * 继承Flyweight超类，并为其内部状态增加存储空间
 */
@Slf4j
public class ConcreteFlyweight extends Flyweight {
    //接受外部状态
    public ConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }
    //根据外部状态进行逻辑处理
    @Override
    public void operate(int extrinsic) {
        log.info("具体Flyweight:" + extrinsic);
    }
}
