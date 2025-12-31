package edu.mce.john.oms.model;

public class Product implements Comparable<Product> {
	private int id;
	private String name;
	private double price;
	
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return Double.compare(this.price, o.price);
	}
	
	@Override
    public String toString() {
        return this.id + " - " + this.name + " : ₹" + price;
    }
	
}
