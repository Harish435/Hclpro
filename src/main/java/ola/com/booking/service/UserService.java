package ola.com.booking.service;

import java.util.List;

import ola.com.booking.model.User;

public interface UserService {

	public void saveUser(User user);
	public boolean validateUser(String username, String password);
	public int getuserobj(String parameter, String parameter2);
}
