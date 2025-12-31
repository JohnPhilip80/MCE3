package edu.mce.john.oms.interfaces;

import java.util.ArrayList;

public interface GenericCRUD<T1,T2> {
	int create(T1 item);
	ArrayList<T1> read();
	T2 update(T1 item);
	T2 delete(T2 id);
}
