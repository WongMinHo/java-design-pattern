package com.minhow.decorator.pattern;

/**
 * @author : MinHow
 * 蓝宝石装饰品
 */
public class BlueGemDecorator implements EquipDecorator {
    /**
     * 每个装饰品维护一个装备
     */
    private Equip equip;

    public BlueGemDecorator(Equip equip)
    {
        this.equip = equip;
    }

    public int calculateAttack()
    {
        return 5 + equip.calculateAttack();
    }

    public String description()
    {
        return equip.description() + "+ 蓝宝石";
    }
}
