package com.minhow.mediator.pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : MinHow
 */
@Slf4j
public class ConcreteColleague extends Colleague {
    public ConcreteColleague(Mediator mediator) {
        super(mediator);
    }
    public void send(String message) {
        mediator.send(message, this);
    }
    public void notify(String message) {
        log.info("同事收到消息：" + message);
    }
}
