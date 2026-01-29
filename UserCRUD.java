package edu.mce.john.oms.interfaces;

import java.util.ArrayList;

import edu.mce.john.oms.models.User;

public interface UserCRUD {
	String create(User user);
	ArrayList<User> readAll();
	String update(User user);
	String delete(String id);
	User readOne(String id);
}
