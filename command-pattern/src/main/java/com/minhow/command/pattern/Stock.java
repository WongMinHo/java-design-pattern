package com.minhow.command.pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : MinHow
 * 库存类
 */
@Slf4j
public class Stock {
    private String name = "水";
    private int quantity = 5;

    /**
     * 购买
     */
    public void buy () {
        log.info("库存 [名称: " + name + ", 数量: " + quantity +" ] 购买");
    }

    /**
     * 卖出
     */
    public void sell() {
        log.info("库存 [名称: " + name + ", 数量: " + quantity +" ] 卖出");
    }
}
