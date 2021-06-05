package com.minhow.decorator.pattern;

/**
 * @author : MinHow
 * 装备接口
 */
public interface Equip {
    /**
     * 计算攻击力
     *
     */
    public int calculateAttack();

    /**
     * 装备的描述
     *
     */
    public String description();
}
