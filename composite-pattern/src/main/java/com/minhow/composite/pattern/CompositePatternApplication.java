package com.minhow.composite.pattern;

/**
 * @author : MinHow
 * 组合模式
 */
public class CompositePatternApplication {

    public static void main(String[] args) {
        //创建根节点及其子节点
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        //创建根节点及其子节点
        Composite compositeA = new Composite("Composite A");
        compositeA.add(new Leaf("Leaf A1"));
        compositeA.add(new Leaf("Leaf B1"));
        root.add(compositeA);

        root.add(new Leaf("Leaf C"));

        root.display(1);
    }

}
