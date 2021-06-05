package com.minhow.strategy.pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : MinHow
 * 策略模式
 */
@Slf4j
public class StrategyPatternApplication {
    public static void main(String[] args) {
        //火车出行
        Context contextTrain = new Context(new Train());
        log.info(contextTrain.goOn());
        //飞机出行
        Context contextAirplane = new Context(new Airplane());
        log.info(contextAirplane.goOn());
    }
}
