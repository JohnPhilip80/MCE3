package edu.mce.john.oms;

import java.util.ArrayList;
import java.util.Scanner;

import edu.mce.john.oms.models.BasketProduct;
import edu.mce.john.oms.models.Product;
import edu.mce.john.oms.services.ProductServices;

public class OrderManagementDemo {

	public static void main(String[] args) {
		ProductServices service = new ProductServices();
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		while(choice != 6) {
			System.out.println("1.Create, 2.ReadAll, 3.Update, 4.Delete, 5.ReadOne, 6.EXIT. Enter Your Choice:");
			choice = scan.nextInt();
			switch(choice) {
			case 1: service.create(); break;
			case 2: service.readAll();break;
			case 3: service.update();break;
			case 4: service.delete();break;
			case 5: service.readOne();break;
			default:
				choice = 6;
			}
		}
		System.out.println("END");
	}
}
