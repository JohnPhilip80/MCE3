package edu.mce.john.oms.model;

public class UPIPayment extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}
