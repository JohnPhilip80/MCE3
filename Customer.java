package edu.mce.john.oms.models;

public class Customer extends User {
	
	

	public Customer(String id, String name, String email, Boolean type) {
		super(id, name, email, type);
	}

	
	public Customer(String name, String email, Boolean type) {
		super(name, email, type);
	}


	@Override
	public String getRole() {
		return "Customer";
	}

	@Override
	public Double calculateDiscount(Double amount) {
		return (this.type)? amount * 0.90: amount * 0.95;
	}

}
