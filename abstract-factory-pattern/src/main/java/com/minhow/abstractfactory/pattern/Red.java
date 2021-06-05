package com.minhow.abstractfactory.pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : MinHow
 * 红色
 */
@Slf4j
public class Red implements Color{
    public void fill() {
        log.info("Inside Red::fill() method.");
    }
}
