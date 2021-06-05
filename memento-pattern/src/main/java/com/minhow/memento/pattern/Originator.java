package com.minhow.memento.pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : MinHow
 * 发起来角色
 */
@Slf4j
public class Originator {
    private String state;

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public Memento createMemento() {
        return new Memento(state);
    }
    public void setMemento(Memento memento) {
        this.state = memento.getState();
    }
    public void show() {
        log.info("State = " + this.state);
    }
}
