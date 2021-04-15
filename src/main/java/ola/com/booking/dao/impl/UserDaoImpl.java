package ola.com.booking.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

import ola.com.booking.ConectionManager;
import ola.com.booking.dao.UserDao;
import ola.com.booking.model.User;

public class UserDaoImpl implements UserDao {

	Connection conn= ConectionManager.getConnection();
	
	@Override
	public void saveUser(User user) {
		try {
			PreparedStatement stmt = conn.prepareStatement("insert into User (User_Id, email, name, password, phonenumber) values (?,?,?,?,?)");
			stmt.setInt(1, user.getuserId());
			stmt.setString(2, user.getEmail());
			stmt.setString(3,user.getName());
			stmt.setString(4, user.getPassword());
			stmt.setString(5, user.getPhoneNo());
			
			stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	@Override
	public boolean validateUser(String username, String password) {
		try {
			PreparedStatement stmt = conn.prepareStatement("SELECT EXISTS(SELECT * FROM User WHERE name=? and password=?)");
		    stmt.setString(1, username);
		    stmt.setString(2, password);
		    
		    return stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public int getobj(String username, String password) {
		// TODO Auto-generated method stub
		int u = 0;
		try {
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM User WHERE name=?");
			 stmt.setString(1, username);
			 //stmt.setString(2, password);
			   ResultSet rs=stmt.executeQuery();  
			    
			    if(rs.next()){  
			    	System.out.println("lhkjhj");
	             u= rs.getInt(1);  
	               
	            }  
			    
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}

	}
