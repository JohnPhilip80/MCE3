package edu.mce.john.oms.repositories;

import java.util.ArrayList;

import edu.mce.john.oms.interfaces.UserCRUD;
import edu.mce.john.oms.models.Admin;
import edu.mce.john.oms.models.Customer;
import edu.mce.john.oms.models.User;

public class UserRepository implements UserCRUD {
	private ArrayList<User> users;
	public UserRepository() {
		users = new ArrayList<User>();
		users.add(new Admin("John","john@gmail.com",true));
		users.add(new Customer("Shiva","siva@gmail.com",false));
		users.add(new Customer("Radha","radha@gmail.com",true));
		users.add(new Customer("Vani","vani@gmail.com",false));
		users.add(new Customer("Prakash","prakash@gmail.com",true));
	}
	
	@Override
	public String create(User user) {
		users.add(user);
		return user.getId();
	}

	@Override
	public ArrayList<User> readAll() {
		return users;
	}

	@Override
	public String update(User item) {
		User user = readOne(item.getId());
		if(user != null) {
			user.setName(item.getName());
			user.setEmail(item.getEmail());
			user.setType(item.getType());
			return item.getId();
		}
		else
			return "Not Found";
	}

	@Override
	public String delete(String id) {
		User user = readOne(id);
		if(user != null) {
			users.remove(user);
			return id;
		}
		else
			return "Not Found";
	}

	@Override
	public User readOne(String id) {
		int index = -1;
		for(int i=0;i<users.size();i++) {
			if(users.get(i).getId().equals(id)) {
				index = i;
				break;
			}
		}
		if(index != -1)
			return users.get(index);
		else
			return null;
	}

}
