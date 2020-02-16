package com.leonardonunes.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.leonardonunes.workshopmongo.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		User user1 = new User("1","John Duuds","john@gmail.com");
		User user2 = new User("2","Sara Steves","sara@gmail.com");
		
		List<User> list = new ArrayList<>();
		
		list.addAll(Arrays.asList(user1,user2));
		
		return ResponseEntity.ok().body(list);
	}
}
