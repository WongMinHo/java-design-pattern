package com.minhow.visitor.pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : MinHow
 * 实体访问者
 */
@Slf4j
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    public void visit(Mouse mouse) {
        log.info("Displaying Mouse.");
    }

    public void visit(Monitor monitor) {
        log.info("Displaying Monitor.");
    }

    public void visit(Computer computer) {
        log.info("Displaying Computer.");
    }

    public void visit(Keyboard keyboard) {
        log.info("Displaying Keyboard.");
    }
}
