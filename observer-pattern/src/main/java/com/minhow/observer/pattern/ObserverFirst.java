package com.minhow.observer.pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : MinHow
 */
@Slf4j
public class ObserverFirst implements Observer {
    private Subject subject;

    public ObserverFirst(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }
    @Override
    public void update(String msg) {
        log.info("ObserverFirst:{}", msg);
    }
}
