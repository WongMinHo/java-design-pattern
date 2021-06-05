package com.minhow.bridge.pattern;

/**
 * @author : MinHow
 * 桥接模式
 */
public class BridgePatternApplication {

    public static void main(String[] args) {
        HandsetBrand hwHandsetBrand = new HWHandsetBrand();
        hwHandsetBrand.setHandsetSoft(new HandsetGame());
        hwHandsetBrand.run();
    }

}
