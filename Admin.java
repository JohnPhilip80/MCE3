package edu.mce.john.oms.models;

public class Admin extends User {

	
	public Admin(String id, String name, String email, Boolean type) {
		super(id, name, email, type);
	}

	
	public Admin(String name, String email, Boolean type) {
		super(name, email, type);
	}


	@Override
	public String getRole() {
		return "Admin";
	}

	@Override
	public Double calculateDiscount(Double amount) {
		
		return amount * 0.70;
	}

}
