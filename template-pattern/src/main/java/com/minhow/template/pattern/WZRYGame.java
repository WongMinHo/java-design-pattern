package com.minhow.template.pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : MinHow
 * 王者荣耀
 */
@Slf4j
public class WZRYGame extends Game {
    public WZRYGame(String name) {
        super(name);
    }
    public void startPlay() {
        log.info(name + "--开始游戏");
    }
}
