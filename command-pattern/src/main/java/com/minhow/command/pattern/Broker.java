package com.minhow.command.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : MinHow
 * 消费者
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void addOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
