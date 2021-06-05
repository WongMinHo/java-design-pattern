package com.minhow.chain.pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : MinHow
 * Info 类
 */
@Slf4j
public class InfoLogger extends AbstractLogger {
    public InfoLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        log.info("Info Logger::" + message);
    }
}
