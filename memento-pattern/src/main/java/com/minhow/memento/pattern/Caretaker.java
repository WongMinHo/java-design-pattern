package com.minhow.memento.pattern;

/**
 * @author : MinHow
 * 备忘录管理员角色
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }
    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
