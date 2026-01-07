package edu.mce.john.oms.models;

public class Product {
	private String id;
	private String name;
	private Double price;
	
	static Integer nextId;
	
	static {
		nextId = 1001;
	}
	public Product() {
		this.id = "P" + nextId;
		nextId++;
		this.name = "";
		this.price = 0.00;
	}
	public Product(String name, Double price) {
		this.id = "P" + nextId;
		nextId++;
		this.name = name;
		this.price = price;
	}
	public Product(String id,String name, Double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override 
	public String toString() {
		return String.format("%-10s%-25s%-15.2f", this.id,this.name,this.price);
	}
	
	
}
