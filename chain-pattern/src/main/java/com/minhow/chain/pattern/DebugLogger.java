package com.minhow.chain.pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : MinHow
 * Debug 类
 */
@Slf4j
public class DebugLogger extends AbstractLogger {
    public DebugLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        log.info("Debug Logger::" + message);
    }
}
