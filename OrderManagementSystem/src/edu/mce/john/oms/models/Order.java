package edu.mce.john.oms.models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Order {
	private Integer id;
	private Integer customerId;
	private LocalDate orderDate;
	private ArrayList<Product> products;
	private Double totalPrice;
	private Double discountPrice;
	private String paymentType;
	private Boolean paymentStatus;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(Integer id, Integer customerId, LocalDate orderDate, ArrayList<Product> products, Double totalPrice,
			Double discountPrice, String paymentType, Boolean paymentStatus) {
		this.id = id;
		this.customerId = customerId;
		this.orderDate = orderDate;
		this.products = products;
		this.totalPrice = totalPrice;
		this.discountPrice = discountPrice;
		this.paymentType = paymentType;
		this.paymentStatus = paymentStatus;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Double getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(Double discountPrice) {
		this.discountPrice = discountPrice;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public Boolean getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(Boolean paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	@Override
	public String toString() {
		return String.format("%-10d%-10d%-15tF%-15.2f%-15.2f%-10s%-10s",
				this.id,this.customerId,this.orderDate, this.totalPrice,this.discountPrice,this.paymentType,this.paymentStatus);
	}
	
	
}
