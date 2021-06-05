package com.minhow.interpreter.pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : MinHow
 * 终结符表达式
 */
@Slf4j
public class TerminalExpression extends AbstractExpression {
    @Override
    public void Interpret(Context context) {
        log.info("终端解释器");
    }
}
