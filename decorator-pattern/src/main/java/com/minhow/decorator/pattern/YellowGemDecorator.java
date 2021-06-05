package com.minhow.decorator.pattern;

/**
 * @author : MinHow
 * 黄宝石装饰品
 */
public class YellowGemDecorator implements EquipDecorator {
    /**
     * 每个装饰品维护一个装备
     */
    private Equip equip;

    public YellowGemDecorator(Equip equip)
    {
        this.equip = equip;
    }

    public int calculateAttack()
    {
        return 10 + equip.calculateAttack();
    }

    public String description()
    {
        return equip.description() + "+ 黄宝石";
    }
}
