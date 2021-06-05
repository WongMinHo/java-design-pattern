package com.minhow.observer.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : MinHow
 */
public class MHObserver implements Subject {
    private List<Observer> observerList = new ArrayList<Observer>();

    private String msg;

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        int index = observerList.indexOf(observer);
        if (index >= 0) {
            observerList.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(msg);
        }
    }

    /**
     * 主题更新消息
     * @param msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
        notifyObservers();
    }
}
