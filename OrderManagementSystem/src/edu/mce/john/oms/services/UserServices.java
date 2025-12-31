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
	public void readUsers() {
		ArrayList<User> users = repo.read();
		System.out.printf("%-10s%-25s%-25s%-10s%-10s\n","Id","Name","Email","Role", "IsPremium");
		for(User user:users) {
			System.out.println(user);
		}
	}
	public void createUser() {
		System.out.println("1.Admin User 2.Customer User. Enter User Role:");
		Integer userRole = scan.nextInt();scan.nextLine();
		System.out.println("Enter User ID:");
		Integer userId = scan.nextInt();scan.nextLine();
		System.out.println("Enter User Name:");
		String userName = scan.nextLine();
		System.out.println("Enter User Email:");
		String userEmail = scan.nextLine();
		System.out.println("Is Premium User <Y / N>?:");
		String userType = scan.nextLine();

		User user;
		if(userRole == 1)
			user = new Admin(userId,userName,userEmail,userType.equals("Y"));
		else
			user = new Customer(userId,userName,userEmail,userType.equals("Y"));
		repo.create(user);
		System.out.println("User Created Successfully!");
	}
	
	public void updateUser() {
		System.out.println("1.Admin User 2.Customer User. Enter User Role:");
		Integer userRole = scan.nextInt();scan.nextLine();
		System.out.println("Enter User ID to update:");
		Integer userId = scan.nextInt();scan.nextLine();
		System.out.println("Enter Updated User Name:");
		String userName = scan.nextLine();
		System.out.println("Enter Updated User Email:");
		String userEmail = scan.nextLine();
		System.out.println("Enter Updated Is Premium User <Y / N>?:");
		String userType = scan.nextLine();
		
		User user;
		if(userRole == 1)
			user = new Admin(userId,userName,userEmail,userType.equals("Y"));
		else
			user = new Customer(userId,userName,userEmail,userType.equals("Y"));

		repo.update(user);
		System.out.println("User Updated Successfully!");
	}
	
	public void deleteUser() {
		System.out.println("Enter User ID to Delete:");
		Integer userId = scan.nextInt();scan.nextLine();
		repo.delete(userId);
		System.out.println("User Deleted Successfully!");
	}
}
