package com.minhow.adapter.pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : MinHow
 * 手机
 */
@Slf4j
public class Mobile {
    /**
     * 充电
     * @param v5Power
     */
    public void inputPower(V5Power v5Power) {
        int provideV5Power = v5Power.provideV5Power();
        log.info("手机需要5V电压充电，现在是-->" + provideV5Power + "V");
    }
}
