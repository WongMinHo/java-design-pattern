package com.minhow.proxy.pattern;

/**
 * @author : MinHow
 * 代理模式
 */
public class ProxyPatternApplication {

    public static void main(String[] args) {
        //定义一个玩家
        GamePlayer gamePlayer = new GamePlayer("MinHow");
        //定义一个代练
        GamePlayerProxy gamePlayerProxy = new GamePlayerProxy(gamePlayer);

        gamePlayerProxy.login("admin", "MinHow");
        gamePlayerProxy.killBoss();
        gamePlayerProxy.upgrade();
    }

}
