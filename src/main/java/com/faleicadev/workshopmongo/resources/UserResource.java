package com.faleicadev.workshopmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faleicadev.workshopmongo.domain.User;
import com.faleicadev.workshopmongo.service.UserService;

@RestController
@RequestMapping(value="/usuarios")
public class UserResource {
	
	@Autowired
	private UserService serviceUser;
	
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> list = serviceUser.findAll();
		return ResponseEntity.ok().body(list);
		
	}
	

}
