package com.minhow.facade.pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : MinHow
 * 正方形
 */
@Slf4j
public class Square implements Shape {
    public void draw() {
        log.info("Inside Square::draw() method.");
    }
}
