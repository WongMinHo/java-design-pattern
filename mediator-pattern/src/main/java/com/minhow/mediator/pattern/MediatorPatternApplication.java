package com.minhow.mediator.pattern;

/**
 * @author : MinHow
 * 中介者模式
 */
public class MediatorPatternApplication {

    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();
        ConcreteColleague concreteColleague = new ConcreteColleague(concreteMediator);
        concreteMediator.setConcreteColleague(concreteColleague);

        concreteColleague.send("Hello MinHow~");
    }

}
