package com.minhow.prototype.pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : MinHow
 * 长方形
 */
@Slf4j
public class Square implements Shape {
    public Object clone() {
        Square circle = null;
        try {
            circle = (Square) super.clone();
        } catch (CloneNotSupportedException e) {
            log.error("拷贝长方形失败!");
        }

        return circle;
    }
    public void countArea() {
        int r = 2;
        log.info("长方形的面积：{}", r * r);
    }
}
