package com.example.one.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.example.one.beans.User;
import com.example.one.controllers.AddResponse;

public class UserService {
	
	static HashMap<Integer,User> userIdPass;
	
	public UserService()
	{
		userIdPass= new HashMap<Integer, User>();
		
			User johnUser = new User(1,"John","1234");
			User janeUser = new User(2,"Jane","2345");
			User joeUser = new User(3,"Joe","3456");
			
			userIdPass.put(1,johnUser);
			userIdPass.put(2,janeUser);
			userIdPass.put(3,joeUser);
	}
	
	
	@SuppressWarnings("unchecked")
	public List getAllUsers() {
		
		List users = new ArrayList(userIdPass.values());
		return users;
	}
	
	public User getUserbyID(int id)
	{
		User user = userIdPass.get(id);
		return user;
	}
	
	public User getUserbyUser(String userName)
	{
		User user = null;
		for(int i:userIdPass.keySet())
		{
			if(userIdPass.get(i).getUserName().equals(userName))
				user=userIdPass.get(i);
		}
		return user;
	}
	
	public User addUser(User user)
	{
		user.setId(getMaxId());
		userIdPass.put(user.getId(), user);
		return user;
	}
	
	public static int getMaxId()
	{
		int max = 0;
		for (int id:userIdPass.keySet())
			if(max<=id)
				max=id;
		return max+1;
	}
	
	public AddResponse deleteUser(int id)
	{
		userIdPass.remove(id);
		AddResponse res = new AddResponse();
		res.setMsg("User deleted");
		res.setId(id);
		return res;
	}

}

