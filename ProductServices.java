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
	public void readAll() {
		ArrayList<Product> products = repo.readAll();
		System.out.printf("%-10s%-25s%-15s\n","Id","Name","Price");
		for(Product product:products) {
			System.out.println(product);
		}
	}
	public void create() {
		System.out.println("Enter Product Name:");
		String productName = scan.nextLine();
		System.out.println("Enter Product Price:");
		Double productPrice = scan.nextDouble();scan.nextLine();
		Product product = new Product(productName,productPrice);
		repo.create(product);
		System.out.println("Product Created Successfully!");
	}
	public void update() {
		System.out.println("Enter Product Id to Update:");
		String productId = scan.nextLine();
		System.out.println("Enter Updated value for Product Name:");
		String productName = scan.nextLine();
		System.out.println("Enter Updated value for Product Price:");
		Double productPrice = scan.nextDouble();scan.nextLine();
		Product product = new Product(productId,productName,productPrice);
		repo.update(product);
		System.out.println("Product Updated Successfully!");
	}
	
	public void delete() {
		System.out.println("Enter Product Id to Delete:");
		String productId = scan.nextLine();
		repo.delete(productId);
		System.out.println("Product Deleted Successfully!");
	}
	
	public void readOne() {
		System.out.println("Enter Product Id:");
		String productId = scan.nextLine();
		Product product = repo.readOne(productId);
		System.out.printf("%-10s%-25s%-15s\n","Id","Name","Price");
		System.out.println(product);
	}
}
