package com.minhow.state.pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : MinHow
 *
 */
@Slf4j
public class StartState implements State {
    public void doAction(Context context) {
        log.info("Player is in start state");
        context.setState(this);
    }

    public String toString() {
        return "Start State";
    }
}
