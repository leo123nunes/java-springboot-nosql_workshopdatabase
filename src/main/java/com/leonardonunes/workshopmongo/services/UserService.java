package com.leonardonunes.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonardonunes.workshopmongo.entities.User;
import com.leonardonunes.workshopmongo.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public  List<User> findAll(){
		return repository.findAll();
	}
}
