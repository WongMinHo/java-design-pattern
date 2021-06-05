package com.minhow.interpreter.pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : MinHow
 * 非终结符表达式
 */
@Slf4j
public class NonTerminalExpression extends AbstractExpression {
    @Override
    public void Interpret(Context context) {
        log.info("非终端解释器");
    }
}
