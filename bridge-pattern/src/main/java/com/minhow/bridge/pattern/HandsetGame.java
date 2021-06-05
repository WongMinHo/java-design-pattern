package com.minhow.bridge.pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : MinHow
 * 手机游戏
 */
@Slf4j
public class HandsetGame extends  HandsetSoft {
    @Override
    public void run() {
        log.info("运行王者手机游戏");
    }
}
