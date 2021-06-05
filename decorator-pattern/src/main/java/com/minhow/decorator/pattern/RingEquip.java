package com.minhow.decorator.pattern;

/**
 * @author : MinHow
 * 戒指
 */
public class RingEquip implements Equip {
    public int calculateAttack()
    {
        return 5;
    }

    public String description()
    {
        return "戒指";
    }

}
