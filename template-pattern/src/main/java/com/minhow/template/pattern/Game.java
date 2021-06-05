package com.minhow.template.pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : MinHow
 * 游戏抽象类
 */
@Slf4j
public abstract class Game {
    protected String name;

    public Game(String name) {
        this.name = name;
    }
    abstract void startPlay();

    public void play() {
        initialize();
        startPlay();
        endPlay();
    }
    public void initialize() {
        log.info(name + "初始化游戏");
    }
    public void endPlay() {
        log.info(name + "结束游戏");
    }
}
