package com.minhow.adapter.pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : MinHow
 * 家用220V交流电
 */
@Slf4j
public class V220Power {
    public int provideV220Power() {
        log.info("提供220V交流电压");
        return 220;
    }
}
