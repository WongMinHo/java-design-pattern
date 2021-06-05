package com.minhow.state.pattern;

/**
 * @author : MinHow
 */
public class Context {
    private State state;

    public Context() {
        this.state = null;
    }

    public void setState(State state) {
        this.state = state;
    }
    public State getState() {
        return this.state;
    }
}
