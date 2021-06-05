package com.minhow.proxy.pattern;

/**
 * @author : MinHow
 * 游戏玩家接口
 */
public interface IGamePlayer {
    //登录
    void login(String username, String password);
    //杀怪
    void killBoss();
    //升级
    void upgrade();
}
