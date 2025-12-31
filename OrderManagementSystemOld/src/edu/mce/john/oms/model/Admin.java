package edu.mce.john.oms.model;

public class Admin extends User {
	public Admin(int id,String name) {
		super(id,name);
	}
	@Override
	public String getRole() {
		return "ADMIN";
	}
}
