package com.minhow.factory.pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : MinHow
 * 圆形
 */
@Slf4j
public class Circle implements Shape {
    public void draw() {
        log.info("Inside Circle::draw() method.");
    }
}
