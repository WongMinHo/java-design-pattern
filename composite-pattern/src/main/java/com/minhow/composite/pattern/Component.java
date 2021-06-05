package com.minhow.composite.pattern;

/**
 * @author : MinHow
 *
 */
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }
    //增加一个叶子构件
    public abstract void add(Component component);
    //删除一个叶子构件
    public abstract void remove(Component component);
    //获取分支下的所有叶子构件
    public abstract void display(int depth);

}
