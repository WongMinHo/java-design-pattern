package com.minhow.abstractfactory.pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : MinHow
 * 蓝色
 */
@Slf4j
public class Blue implements Color{
    public void fill() {
        log.info("Inside Blue::fill() method.");
    }
}
