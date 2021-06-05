package com.minhow.template.pattern;

/**
 * @author : MinHow
 * 模板模式
 */
public class TemplatePatternApplication {

    public static void main(String[] args) {
        LOLGame lolGame = new LOLGame("LOL");
        lolGame.play();

        MHXYGame mhxyGame = new MHXYGame("梦幻西游");
        mhxyGame.play();

        WZRYGame wzryGame = new WZRYGame("王者荣耀");
        wzryGame.play();

    }

}
