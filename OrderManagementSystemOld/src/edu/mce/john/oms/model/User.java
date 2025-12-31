package edu.mce.john.oms.model;

public class User {
	protected int id;
	protected String name;
	
	public User(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	public String getRole() {
		return "USER";
	}
	
	public double calculateDiscount() {
		return 0;
	}
	public int getId() {
		return id;
	}
}
