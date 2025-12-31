package edu.mce.john.oms;

import java.util.Scanner;
import edu.mce.john.oms.services.UserServices;

public class OrderManagementDemo {

	public static void main(String[] args) {
		UserServices serv = new UserServices();
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		while(choice != 5) {
			System.out.println("1.Create, 2.Read All, 3.Update, 4.Delete, 5.Exit. Enter Your Choice:");
			choice=scan.nextInt();scan.nextLine();
			switch(choice) {
			case 1: serv.createUser();break;
			case 2: serv.readUsers();break;
			case 3: serv.updateUser();break;
			case 4: serv.deleteUser();break;
			default:
				choice = 5;
			}
		}
		System.out.println("EXIT");
	}
}
