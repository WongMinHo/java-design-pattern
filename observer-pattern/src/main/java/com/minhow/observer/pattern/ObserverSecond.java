package com.minhow.observer.pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : MinHow
 */
@Slf4j
public class ObserverSecond implements Observer {
    private Subject subject;

    public ObserverSecond(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }
    @Override
    public void update(String msg) {
        log.info("ObserverSecond:{}", msg);
    }
}
