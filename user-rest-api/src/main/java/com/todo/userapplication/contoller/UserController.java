package com.todo.userapplication.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.todo.userapplication.beans.UserDTO;
import com.todo.userapplication.exception.UserNotFoundException;
import com.todo.userapplication.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService service;
	
	@GetMapping("/userlist")
	public List<UserDTO> retriveUserList()
	{
		System.out.println("Get ALL List");
		return service.getALLUserList();
		
	}

	@GetMapping("/findUser/{id}")
	public UserDTO findUser(@PathVariable("id") int id) throws UserNotFoundException
	{
		
		System.out.println("Find User"+id);
		UserDTO user = new UserDTO();
		
		System.out.println("Find User");
		user =  service.findUser(id);
		
		
		return user;
	}
	

}
