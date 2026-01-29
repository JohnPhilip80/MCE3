package edu.mce.john.oms.services;

import java.util.ArrayList;
import java.util.Scanner;

import edu.mce.john.oms.models.Admin;
import edu.mce.john.oms.models.Customer;
import edu.mce.john.oms.models.User;
import edu.mce.john.oms.repositories.UserRepository;

public class UserServices {
	private UserRepository repo;
	private Scanner scan;
	public UserServices() {
		repo = new UserRepository();
		scan = new Scanner(System.in);
	}
	public void readAll() {
		ArrayList<User> users = repo.readAll();
		System.out.printf("%-10s%-25s%-25s%-10s%-10s\n","Id","Name","Email","Role","IsPremium");
		for(User user:users) {
			System.out.println(user);
		}
	}
	public void create() {
		System.out.println("1.Admin 2.Customer. Enter User Role:");
		Integer userRole = scan.nextInt();scan.nextLine();
		
		System.out.println("Enter User Name:");
		String userName = scan.nextLine();
		System.out.println("Enter User Email:");
		String userEmail = scan.nextLine();
		System.out.println("Is Premium User <Y / N>?");
		String userType = scan.nextLine();
		User user;
		if(userRole == 1)
			user = new Admin(userName,userEmail,userType.equals("Y"));
		else
			user = new Customer(userName,userEmail,userType.equals("Y"));
		repo.create(user);
		System.out.println("User Created Successfully!");
	}
	public void update() {
		System.out.println("1.Admin 2.Customer. Enter User Role:");
		Integer userRole = scan.nextInt();scan.nextLine();
		System.out.println("Enter User Id to Update:");
		String userId = scan.nextLine();
		
		System.out.println("Enter Updated Value for User Name:");
		String userName = scan.nextLine();
		System.out.println("Enter Updated Value for User Email:");
		String userEmail = scan.nextLine();
		System.out.println("Enter Updated Value for Is Premium User <Y / N>?");
		String userType = scan.nextLine();
		
		User user;
		if(userRole == 1)
			user = new Admin(userId,userName,userEmail,userType.equals("Y"));
		else
			user = new Customer(userId,userName,userEmail,userType.equals("Y"));
		repo.create(user);
		System.out.println("User Updated Successfully!");
	}
	
	public void delete() {
		System.out.println("Enter User Id to Delete:");
		String userId = scan.nextLine();
		repo.delete(userId);
		System.out.println("User Deleted Successfully!");
	}
	
	public void readOne() {
		System.out.println("Enter User Id:");
		String userId = scan.nextLine();
		User user = repo.readOne(userId);
		System.out.printf("%-10s%-25s%-25s%-10s%-10s","Id","Name","Email","Role","IsPremium");
		System.out.println(user);
	}
}
