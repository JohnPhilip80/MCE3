package edu.mce.john.oms.model;

import edu.mce.john.oms.interfaces.Payable;

public abstract class Payment implements Payable {
    public abstract void pay(double amount);
}
