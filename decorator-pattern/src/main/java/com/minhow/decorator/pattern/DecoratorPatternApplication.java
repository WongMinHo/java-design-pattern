package com.minhow.decorator.pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : MinHow
 * 装饰器模式
 */
@Slf4j
public class DecoratorPatternApplication {

    public static void main(String[] args) {
        //一个包含两颗红宝石，一颗黄宝石的戒指
        Equip equip = new RedGemDecorator(new RedGemDecorator(new YellowGemDecorator(new RingEquip())));
        log.info("攻击力：" + equip.calculateAttack());
        log.info("描述：" + equip.description());

        //一个包含一颗蓝宝石，一颗红宝石的武器
        equip = new BlueGemDecorator(new RedGemDecorator(new ArmEquip()));
        log.info("攻击力：" + equip.calculateAttack());
        log.info("描述：" + equip.description());
    }

}
