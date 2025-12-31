package edu.mce.john.oms.repositories;

import java.util.ArrayList;
import edu.mce.john.oms.interfaces.GenericCRUD;
import edu.mce.john.oms.models.BasketProduct;

public class BasketProductRepository implements GenericCRUD <BasketProduct,Integer> {
	
	private ArrayList<BasketProduct> products;
	
	public BasketProductRepository() {
		products = new ArrayList<BasketProduct>();
		products.add(new BasketProduct(1001,"Laptop",62800.00, 2));
		products.add(new BasketProduct(1002,"IPhone",72800.00, 4));
		products.add(new BasketProduct(1003,"Earbuds",5350.00, 1));
		products.add(new BasketProduct(1004,"Power Bank",4200.00, 1));
		products.add(new BasketProduct(1005,"Smart Watch",7270.00,2));
	}
	@Override
	public int create(BasketProduct item) {
		products.add(item);
		return item.getId();
	}
	@Override
	public ArrayList<BasketProduct> read() {
		return products;
	}
	@Override
	public Integer update(BasketProduct item) {
		int index = -1;
		for(int i=0;i<products.size();i++) {
			if(products.get(i).getId().equals(item.getId())) {
				index = i;
				break;
			}
		}
		if(index != -1) {
			products.set(index, item);
		}
		else {
			System.out.println("Product Not Found!");
		}
		return index;
	}
	@Override
	public Integer delete(Integer id) {
		int index = -1;
		for(int i=0;i<products.size();i++) {
			if(products.get(i).getId().equals(id)) {
				index = i;
				break;
			}
		}
		if(index != -1) {
			products.remove(index);
		}
		else {
			System.out.println("Product Not Found!");
		}
		return index;
	}

}


