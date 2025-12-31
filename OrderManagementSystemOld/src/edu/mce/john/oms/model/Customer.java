package edu.mce.john.oms.model;

import edu.mce.john.oms.interfaces.Discountable;

public class Customer extends User implements Discountable {
	public Customer(int id,String name) {
		super(id,name);
	}
	@Override
	public String getRole() {
		return "CUSTOMER";
	}
	@Override
	public double applyDiscount(double amount) {
		
		return amount * 0.90; //10% discount
	}
	
	
}
