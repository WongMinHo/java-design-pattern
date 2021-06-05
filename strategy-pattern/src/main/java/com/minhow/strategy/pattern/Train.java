package com.minhow.strategy.pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : MinHow
 * 火车出行
 */
@Slf4j
public class Train implements Travel {
    public String go() {
        return "火车出行~";
    }
}
