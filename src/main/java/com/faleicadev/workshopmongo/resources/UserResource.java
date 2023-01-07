package com.faleicadev.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faleicadev.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/usuarios")
public class UserResource {
	
	
	@GetMapping
	public List<User> findAll(){
		User u1 = new User("1", "Fabio Leite", "fabio@gmail.com");
		User u2 = new User("2", "Daniela Pontes", "daniela@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(u1, u2));
		return list;
		
	}
	

}
