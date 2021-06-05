package com.minhow.decorator.pattern;

/**
 * @author : MinHow
 * 护腕
 */
public class WristEquip implements Equip {
    public int calculateAttack()
    {
        return 5;
    }

    public String description()
    {
        return "护腕";
    }

}
