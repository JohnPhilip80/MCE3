package edu.mce.john.oms.models;

public abstract class User {
	protected Integer id;
	protected String name;
	protected String email;
	protected Boolean type;
	public User(Integer id, String name, String email, Boolean type) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.type = type;
	}
	public User() {
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Boolean getType() {
		return type;
	}
	public void setType(Boolean type) {
		this.type = type;
	}
	
	public abstract String getRole();
	public abstract Double calculateDiscount(Double amount);
	@Override
	public String toString() {
		return String.format("%-10s%-25s%-25s%-10s%-10s",
				this.id,this.name,this.email,this.getRole(),(this.type) ? "Yes": "No");
	}
}
