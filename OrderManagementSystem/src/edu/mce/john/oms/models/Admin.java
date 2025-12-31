package edu.mce.john.oms.models;

public class Admin extends User {
	public Admin(Integer id, String name, String email, Boolean type) {
		super(id, name, email, type);
	}

	@Override
	public String getRole() {
		return "ADMIN";
	}

	@Override
	public Double calculateDiscount(Double amount) {
		return amount * 0.70;
	}

}
