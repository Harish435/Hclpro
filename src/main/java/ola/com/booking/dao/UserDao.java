package ola.com.booking.dao;

import java.util.List;

import ola.com.booking.model.User;

public interface UserDao {

	void saveUser(User user);
    boolean validateUser(String username, String password);
	int getobj(String username, String password);
	
}
