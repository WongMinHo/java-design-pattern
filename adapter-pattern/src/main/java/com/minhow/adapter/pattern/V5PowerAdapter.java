package com.minhow.adapter.pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : MinHow
 * 适配器，把220V电压变成5V
 */
@Slf4j
public class V5PowerAdapter implements V5Power {
    private V220Power v220Power;

    public V5PowerAdapter(V220Power v220Power) {
        this.v220Power = v220Power;
    }

    public int provideV5Power() {
        int power = this.v220Power.provideV220Power();

        log.info("适配器：把220V电压转成5V");

        return 5;
    }
}
