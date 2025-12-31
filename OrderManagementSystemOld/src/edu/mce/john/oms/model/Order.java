package edu.mce.john.oms.model;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class Order {
    private String orderId;
    private List<Product> products;
    private LocalDate orderDate;

    public Order(List<Product> products) {
        this.orderId = UUID.randomUUID().toString();
        this.products = products;
        this.orderDate = LocalDate.now();
    }

    public double totalAmount() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId +
               ", Date: " + orderDate +
               ", Total: ₹" + totalAmount();
    }
}
