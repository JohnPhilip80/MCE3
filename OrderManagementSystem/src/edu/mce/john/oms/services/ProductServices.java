package edu.mce.john.oms.services;

import java.util.ArrayList;
import java.util.Scanner;
import edu.mce.john.oms.models.Product;
import edu.mce.john.oms.repositories.ProductRepository;

public class ProductServices {
	private ProductRepository repo;
	private Scanner scan;
	public ProductServices() {
		repo = new ProductRepository();
		scan = new Scanner(System.in);
	}
	public void readProducts() {
		ArrayList<Product> products = repo.read();
		System.out.printf("%-10s%-25s%-15s\n","Id","Name","Price");
		for(Product product:products) {
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
		Product product = new Product(productId,productName,productPrice);
		repo.create(product);
		System.out.println("Product Created Successfully!");
	}
	public void updateProduct() {
		System.out.println("Enter Product ID to update:");
		Integer productId = scan.nextInt();scan.nextLine();
		System.out.println("Enter Updated Product Name:");
		String productName = scan.nextLine();
		System.out.println("Enter Updated Product Price");
		Double productPrice = scan.nextDouble();scan.nextLine();
		Product product = new Product(productId,productName,productPrice);
		repo.update(product);
		System.out.println("Product Updated Successfully!");
	}
	
	public void deleteProduct() {
		System.out.println("Enter Product ID to Delete:");
		Integer productId = scan.nextInt();scan.nextLine();
		repo.delete(productId);
		System.out.println("Product Deleted Successfully!");
	}
}


























