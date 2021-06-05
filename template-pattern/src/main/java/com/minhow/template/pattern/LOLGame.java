package com.minhow.template.pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : MinHow
 * LOL
 */
@Slf4j
public class LOLGame extends Game {
    public LOLGame(String name) {
        super(name);
    }
    public void startPlay() {
        log.info(name + "--开始游戏");
    }
}
