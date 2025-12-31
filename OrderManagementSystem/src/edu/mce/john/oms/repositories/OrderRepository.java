package edu.mce.john.oms.repositories;

import java.util.ArrayList;

import edu.mce.john.oms.interfaces.GenericCRUD;
import edu.mce.john.oms.models.Order;

public class OrderRepository implements GenericCRUD <Order,Integer> {
	
	private ArrayList<Order> orders;
	
	public OrderRepository() {
		orders = new ArrayList<Order>();
	}

	@Override
	public int create(Order item) {
		orders.add(item);
		return item.getId();
	}

	@Override
	public ArrayList<Order> read() {
		return orders;
	}

	@Override
	public Integer update(Order item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
