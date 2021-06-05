package com.minhow.decorator.pattern;

/**
 * @author : MinHow
 * 武器
 */
public class ArmEquip implements Equip {
    public int calculateAttack()
    {
        return 20;
    }

    public String description()
    {
        return "屠龙刀";
    }

}
