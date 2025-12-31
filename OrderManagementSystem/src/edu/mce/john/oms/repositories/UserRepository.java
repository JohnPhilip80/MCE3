package edu.mce.john.oms.repositories;

import java.util.ArrayList;
import edu.mce.john.oms.interfaces.GenericCRUD;
import edu.mce.john.oms.models.Admin;
import edu.mce.john.oms.models.Customer;
import edu.mce.john.oms.models.User;

public class UserRepository implements GenericCRUD<User,Integer>  {
	private ArrayList<User> users;
	
	public UserRepository() {
		users = new ArrayList<User>();
		users.add(new Admin(9001,"John","john@gmail.com",true));
		users.add(new Customer(5001,"Siva","siva@gmail.com",true));
		users.add(new Customer(5002,"Radha","radha@gmail.com",false));
		users.add(new Customer(5003,"Vani","vani@gmail.com",true));
		users.add(new Customer(5004,"Prakash","prakash@gmail.com",false));
	}

	@Override
	public int create(User item) {
		users.add(item);
		return item.getId();
	}

	@Override
	public ArrayList<User> read() {
		return users;
	}

	@Override
	public Integer update(User item) {
		int index = -1;
		for(int i=0;i<users.size();i++) {
			if(users.get(i).getId().equals(item.getId())) {
				index = i;
				break;
			}
		}
		if(index != -1) {
			users.set(index, item);
		}
		else {
			System.out.println("User Not Found!");
		}
		return index;
	}

	@Override
	public Integer delete(Integer id) {
		int index = -1;
		for(int i=0;i<users.size();i++) {
			if(users.get(i).getId().equals(id)) {
				index = i;
				break;
			}
		}
		if(index != -1) {
			users.remove(index);
		}
		else {
			System.out.println("User Not Found!");
		}
		return index;
	}
}
