package edu.mce.john.oms.models;

public class Customer extends User {
	public Customer(Integer id, String name, String email, Boolean type) {
		super(id, name, email, type);
	}

	@Override
	public String getRole() {
		return "CUSTOMER";
	}

	@Override
	public Double calculateDiscount(Double amount) {
		return (this.type)?amount * 0.90:amount * 0.95;

	}
}
