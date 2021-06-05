package com.minhow.proxy.pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : MinHow
 * 游戏代练
 */
@Slf4j
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer = null;
    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }
    @Override
    public void login(String username, String password) {
        this.gamePlayer.login(username, password);
    }
    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }
    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }
}
