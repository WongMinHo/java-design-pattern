package com.minhow.bridge.pattern;

/**
 * @author : MinHow
 * 手机品牌抽象类
 */
public abstract class HandsetBrand {
    protected HandsetSoft handsetSoft;

    public void setHandsetSoft(HandsetSoft handsetSoft) {
        this.handsetSoft = handsetSoft;
    }
    public abstract void run();
}
