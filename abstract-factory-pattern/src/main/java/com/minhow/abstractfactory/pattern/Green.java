package com.minhow.abstractfactory.pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : MinHow
 * 绿色
 */
@Slf4j
public class Green implements Color{
    public void fill() {
        log.info("Inside Green::fill() method.");
    }
}
