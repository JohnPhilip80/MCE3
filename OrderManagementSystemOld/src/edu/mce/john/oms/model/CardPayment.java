package edu.mce.john.oms.model;

public class CardPayment extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Card");
    }
}
