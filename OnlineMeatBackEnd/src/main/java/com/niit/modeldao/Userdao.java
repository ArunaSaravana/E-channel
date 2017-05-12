package com.niit.modeldao;

import java.util.List;

import com.niit.modeldto.*;

public interface Userdao
{
	public void addUser(User user);
	public void updateUser(User user);
	public void deleteUser(int cust_id);
	public User getUserByUserName(String username);
	public List<Product> displayAll();
}
