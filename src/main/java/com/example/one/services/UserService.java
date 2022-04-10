package com.example.one.services;

import java.util.HashMap;

import com.example.one.beans.User;

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

}
