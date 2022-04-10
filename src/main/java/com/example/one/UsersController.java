package com.example.one;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {
	
	@GetMapping
	public String getUsers()
	{
		return "http GET request was sent";
	}
	
	@PostMapping
	public String createUser()
	{
		return "http POST request was sent";
	}
	
	@PutMapping
	public String updateUser()
	{
		return "http PUT request was sent";
	}
	
	@DeleteMapping
	public String deleteUser()
	{
		return "http DELETE request was sent";
	}
	
	

}
