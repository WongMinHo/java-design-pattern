package com.minhow.strategy.pattern;


import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
@Slf4j
class StrategyPatternApplicationTests {

	@Test
    void test() {
		//火车出行
		Context contextTrain = new Context(new Train());
		log.info(contextTrain.goOn());
		//飞机出行
		Context contextAirplane = new Context(new Airplane());
		log.info(contextAirplane.goOn());
	}

}
