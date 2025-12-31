package edu.mce.john.oms.service;

import java.util.HashMap;
import java.util.Map;

import edu.mce.john.oms.model.Order;

public class OrderService {
    private Map<Integer, Order> orderMap = new HashMap<>();
    private int orderCounter = 1;

    public void placeOrder(Order order) {
        orderMap.put(orderCounter++, order);
    }

    public void showOrders() {
        orderMap.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
