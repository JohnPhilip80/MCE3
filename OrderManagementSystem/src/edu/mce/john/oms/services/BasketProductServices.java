package edu.mce.john.oms.services;

import java.util.ArrayList;
import java.util.Scanner;
import edu.mce.john.oms.models.BasketProduct;
import edu.mce.john.oms.repositories.BasketProductRepository;

public class BasketProductServices {
	private BasketProductRepository repo;
	private Scanner scan;
	public BasketProductServices() {
		repo = new BasketProductRepository();
		scan = new Scanner(System.in);
	}
	
	public void readProducts() {
		ArrayList<BasketProduct> products = repo.read();
		System.out.printf("%-10s%-25s%-15s%-10s\n","Id","Name","Price","Quantity");
		for(BasketProduct product:products) {
			System.out.println(product);
		}
	}
	
	public void createProduct() {
		System.out.println("Enter Product ID:");
		Integer productId = scan.nextInt();scan.nextLine();
		System.out.println("Enter Product Name:");
		String productName = scan.nextLine();
		System.out.println("Enter Product Price");
		Double productPrice = scan.nextDouble();scan.nextLine();
		System.out.println("Enter Product Quantity:");
		Integer productQuantity = scan.nextInt();scan.nextLine();
		BasketProduct product = new BasketProduct(productId,productName,productPrice,productQuantity);
		repo.create(product);
		System.out.println("Basket Product Created Successfully!");
	}
	
	public void updateProduct() {
		System.out.println("Enter Product ID to update:");
		Integer productId = scan.nextInt();scan.nextLine();
		System.out.println("Enter Updated Product Name:");
		String productName = scan.nextLine();
		System.out.println("Enter Updated Product Price");
		Double productPrice = scan.nextDouble();scan.nextLine();
		System.out.println("Enter Updated Product Quantity:");
		Integer productQuantity = scan.nextInt();scan.nextLine();
		BasketProduct product = new BasketProduct(productId,productName,productPrice,productQuantity);
		repo.update(product);
		System.out.println("Basket Product Updated Successfully!");
	}
	
	public void deleteProduct() {
		System.out.println("Enter Product ID to Delete:");
		Integer productId = scan.nextInt();scan.nextLine();
		repo.delete(productId);
		System.out.println("Basket Product Deleted Successfully!");
	}
}

















