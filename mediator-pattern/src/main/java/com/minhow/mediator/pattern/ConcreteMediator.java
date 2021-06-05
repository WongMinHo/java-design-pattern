package com.minhow.mediator.pattern;

/**
 * @author : MinHow
 * 具体中介者类
 */
public class ConcreteMediator extends Mediator {
    private ConcreteColleague concreteColleague;

    public void setConcreteColleague(ConcreteColleague concreteColleague) {
        this.concreteColleague = concreteColleague;
    }
    @Override
    public void send(String message, Colleague colleague) {
        concreteColleague.notify(message);
    }
}
