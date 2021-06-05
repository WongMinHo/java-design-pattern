package com.minhow.decorator.pattern;

/**
 * @author : MinHow
 * 红宝石装饰品
 */
public class RedGemDecorator implements EquipDecorator {
    /**
     * 每个装饰品维护一个装备
     */
    private Equip equip;

    public RedGemDecorator(Equip equip)
    {
        this.equip = equip;
    }

    public int calculateAttack()
    {
        return 15 + equip.calculateAttack();
    }

    public String description()
    {
        return equip.description() + "+ 红宝石";
    }
}
