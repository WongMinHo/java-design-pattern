package com.minhow.proxy.pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : MinHow
 * 游戏玩家
 */
@Slf4j
public class GamePlayer implements IGamePlayer {
    private String user;
    public GamePlayer(String user) {
        this.user = user;
    }
    @Override
    public void login(String username, String password) {
        log.info("用户为[" + user + "]，登陆[" + username + "]账号成功！");
    }
    @Override
    public void killBoss() {
        log.info(this.user + "-打怪");
    }
    @Override
    public void upgrade() {
        log.info(this.user + "-升级了");
    }
}
