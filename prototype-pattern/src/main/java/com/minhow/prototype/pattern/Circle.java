package com.minhow.prototype.pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : MinHow
 * 圆
 */
@Slf4j
public class Circle implements Shape {
    public Object clone() {
        Circle circle = null;
        try {
            circle = (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            log.error("拷贝圆失败!");
        }

        return circle;
    }
    public void countArea() {
        int r = 2;
        log.info("圆的面积：{}", 3.14 * r * r);
    }
}
