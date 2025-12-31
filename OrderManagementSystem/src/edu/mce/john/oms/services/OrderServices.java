package edu.mce.john.oms.services;

import edu.mce.john.oms.repositories.BasketProductRepository;
import edu.mce.john.oms.repositories.OrderRepository;
import edu.mce.john.oms.repositories.ProductRepository;

public class OrderServices {
	private OrderRepository orderRepo;
	private ProductRepository productRepo;
	private BasketProductRepository basketRepo;
	
	
	public OrderServices() {
		repo = new OrderRepository();
	}
}
