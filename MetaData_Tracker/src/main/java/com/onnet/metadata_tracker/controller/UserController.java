package com.onnet.metadata_tracker.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.onnet.metadata_tracker.model.UserModel;
import com.onnet.metadata_tracker.service.UserService;

@RestController

public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/AddUser")
	public UserModel addUser(@RequestBody UserModel user) {
		return userService.saveUser(user);
	}
	
	@GetMapping("/getUserByOsId/{os_id}")
	public UserModel getUserByOsId(@PathVariable String os_id) {
		return userService.getUserByOsId(os_id);
	}
	
	@GetMapping("/getUserById/{id}")
	public UserModel getUserById(@PathVariable long id) {
		return userService.getUserById(id);
	}
	
	@GetMapping("/getAllUser")
	public List<UserModel> getAllUser() {
		return userService.getAllUser();
	}
	
	@DeleteMapping("/DeleteUser")
	public String DeleteUser(@RequestBody long id) {
		 return userService.deleteUser(id);	 
	}
	
	@PostMapping("/UpdateUser")
	public UserModel updateUser(@RequestBody UserModel user) {
		return userService.updateUser(user);
	}
	
	
	
}
