package com.minhow.strategy.pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : MinHow
 * 飞机出行
 */
@Slf4j
public class Airplane implements Travel {
    public String go() {
        return "飞机出行~";
    }
}
