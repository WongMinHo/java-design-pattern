package com.minhow.abstractfactory.pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : MinHow
 * 长方形
 */
@Slf4j
public class Rectangle implements Shape {
    public void draw() {
        log.info("Inside Rectangle::draw() method.");
    }
}