package com.minhow.state.pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : MinHow
 *
 */
@Slf4j
public class StopState implements State {
    public void doAction(Context context) {
        log.info("Player is in stop state");
        context.setState(this);
    }

    public String toString() {
        return "Stop State";
    }
}
