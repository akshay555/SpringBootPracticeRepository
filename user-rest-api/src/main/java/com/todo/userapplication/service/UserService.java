package com.todo.userapplication.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.todo.userapplication.beans.UserDTO;
import com.todo.userapplication.exception.UserNotFoundException;

@Component
public class UserService {
	
	private static final UserDTO userDTO = null;
	static	List<UserDTO> userlist = new ArrayList<UserDTO>();
	
	
	static{
		userlist.add(new UserDTO(11,"Akshay","Mumbai"));

		userlist.add(new UserDTO(12,"Ram","Delhi"));

		userlist.add(new UserDTO(13,"Bharat","Hasan"));

		userlist.add(new UserDTO(14,"Joe","Bidar"));

		userlist.add(new UserDTO(15,"Jenifer","Latur"));
		
	}
	
	public List<UserDTO> getALLUserList()
	{
		return userlist;
		
	}

	
	public UserDTO findUser(int id) throws UserNotFoundException
	{
		for (UserDTO userDTO : userlist) {
			
			if(userDTO.getId()==id)
			{
				return userDTO;
			}else
			{
				throw new UserNotFoundException("User :"+id +"Not Found");
			}
		} 
		return userDTO;
	
		
	}

}
