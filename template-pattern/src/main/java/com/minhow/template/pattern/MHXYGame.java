package com.minhow.template.pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : MinHow
 * 梦幻西游
 */
@Slf4j
public class MHXYGame extends Game {
    public MHXYGame(String name) {
        super(name);
    }
    public void startPlay() {
        log.info(name + "--开始游戏");
    }
}
