package com.minhow.memento.pattern;

/**
 * @author : MinHow
 * 备忘录角色
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }
    public String getState() {
        return this.state;
    }
}
