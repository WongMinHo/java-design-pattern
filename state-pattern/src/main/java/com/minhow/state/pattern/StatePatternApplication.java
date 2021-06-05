package com.minhow.state.pattern;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StatePatternApplication {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        log.info(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        log.info(context.getState().toString());
    }

}
