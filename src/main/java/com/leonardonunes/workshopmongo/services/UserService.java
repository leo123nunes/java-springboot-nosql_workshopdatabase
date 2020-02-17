package com.leonardonunes.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonardonunes.workshopmongo.dto.UserDTO;
import com.leonardonunes.workshopmongo.entities.User;
import com.leonardonunes.workshopmongo.repositories.UserRepository;
import com.leonardonunes.workshopmongo.services.exceptions.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public  List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(String id) {
		User user = repository.findById(id).orElse(null);
		if(user==null) {
			throw new ObjectNotFoundException("Id not found.");
		}
		return user;
	}
	
	public User insert(User obj) {
		return repository.insert(obj);
	}
	
	public User fromDTO(UserDTO obj) {
		User user = new User(obj.getId(), obj.getName(), obj.getEmail());
		return user;
	}
}
