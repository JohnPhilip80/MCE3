package edu.mce.john.oms.repositories;

import java.util.ArrayList;

import edu.mce.john.oms.interfaces.ProductCRUD;
import edu.mce.john.oms.models.Product;

public class ProductRepository implements ProductCRUD {
	ArrayList<Product> products;
	public ProductRepository() {
		products = new ArrayList<Product>();
		products.add(new Product("Laptop",43800.00));
		products.add(new Product("Samsung Phone",30500.00));
		products.add(new Product("Bluetooth Neckband",7300.00));
		products.add(new Product("Powerbank",4780.00));
		products.add(new Product("Smart Watch",3480.00));
	}
	@Override
	public String create(Product product) {
		products.add(product);
		return product.getId();
	}
	@Override
	public ArrayList<Product> readAll() {
		return products;
	}
	@Override
	public String update(Product item) {
		Product product = readOne(item.getId());
		if(product != null) {
			product.setName(item.getName());
			product.setPrice(item.getPrice());
			return item.getId();
		}
		else
			return "Not Found";
	}
	@Override
	public String delete(String id) {
		Product product = readOne(id);
		if(product != null) {
			products.remove(product);
			return id;
		}
		else
			return "Not Found";
	}
	@Override
	public Product readOne(String id) {
		int index = -1;
		for(int i=0;i<products.size();i++) {
			if(products.get(i).getId().equals(id)) {
				index = i;
				break;
			}
		}
		if(index != -1)
			return products.get(index);
		else
			return null;
	}
}
