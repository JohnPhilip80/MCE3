package edu.mce.john.oms.interfaces;

import java.util.ArrayList;

import edu.mce.john.oms.models.Product;

public interface ProductCRUD {
	
	int createProduct(Product product);
	ArrayList<Product> readProducts();
	int updateProduct(Product product);
	int deleteProduct(Integer id);

}
