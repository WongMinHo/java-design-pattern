package com.minhow.memento.pattern;

/**
 * @author : MinHow
 * 备忘录模式
 */
public class MementoPatternApplication {

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("ON");
        originator.show();

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        originator.setState("Off");
        originator.show();

        originator.setMemento(caretaker.getMemento());
        originator.show();
    }

}
