package com.minhow.composite.pattern;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

/**
 * @author : MinHow
 * 树枝
 */
@Slf4j
public class Composite extends Component {
    private ArrayList<Component> componentArrayList = new ArrayList<Component>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        this.componentArrayList.add(component);
    }

    @Override
    public void remove(Component component) {
        this.componentArrayList.remove(component);
    }

    @Override
    public void display(int depth) {
        //输出树形结构
        for (int i = 0; i < depth; i++) {
            log.info("-");
        }
        log.info(name);
        //下级遍历
        for (Component component : componentArrayList) {
            component.display(depth + 1);
        }
    }
}
