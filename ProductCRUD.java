package edu.mce.john.oms.interfaces;

import java.util.ArrayList;
import edu.mce.john.oms.models.Product;

public interface ProductCRUD {
	String create(Product product);
	ArrayList<Product> readAll();
	String update(Product product);
	String delete(String id);
	Product readOne(String id);
}
