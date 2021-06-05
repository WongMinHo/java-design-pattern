package com.minhow.chain.pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : MinHow
 * Error 类
 */
@Slf4j
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        log.info("Error Logger::" + message);
    }
}
