package com.minhow.composite.pattern;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

/**
 * @author : MinHow
 * 树叶
 */
@Slf4j
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
    }

    @Override
    public void remove(Component component) {
    }

    @Override
    public void display(int depth) {
        //输出树形结构
        for (int i = 0; i < depth; i++) {
            log.info("-");
        }
        log.info(name);
    }
}
