package com.minhow.builder.pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : MinHow
 * 产品
 */
@Slf4j
public class Product {
    private String name;

    private String type;

    public void showProduct() {
        log.info("名称：" + name);
        log.info("型号：" + type);
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setType(String type) {
        this.type = type;
    }
}
