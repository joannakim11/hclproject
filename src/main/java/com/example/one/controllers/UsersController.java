package com.example.one.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.one.beans.User;
import com.example.one.services.UserService;

@RestController
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/getusers")
	public List getUsers()
	{
		return userService.getAllUsers();
	}
	
	@GetMapping("getusers/{id}")
	public User getUserbyID(@PathVariable(value="id") int id)
	{
		return userService.getUserbyID(id);
		
	}
	
	@GetMapping("getusers/username")
	public User getUserbyUser(@RequestParam(value="name") String userName)
	{
		return userService.getUserbyUser(userName);
		
	}
	
	@PostMapping("/adduser")
	public User addUser(@RequestBody User user)
	{
		return userService.addUser(user);
	}
	
	@PutMapping("/updateuser")
	public User updateUser(@RequestBody User user)
	{
		return userService.addUser(user);
	}
	
	@DeleteMapping("/deleteuser/{id}")
	public AddResponse deleteUser(@PathVariable(value="id") int id)
	{
		return userService.deleteUser(id);
	}
	
	

}
