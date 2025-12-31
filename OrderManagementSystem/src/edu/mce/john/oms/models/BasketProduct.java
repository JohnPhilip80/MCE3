package edu.mce.john.oms.models;

public class BasketProduct {
	private Integer id;
	private String name;
	private Double price;
	private Integer quantity;
	public BasketProduct() {
	}
	public BasketProduct(Integer id, String name, Double price, Integer quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
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
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return String.format("%-10d%-25s%-15.2f%-10d",this.id,this.name,this.price,this.quantity);
	}
}































