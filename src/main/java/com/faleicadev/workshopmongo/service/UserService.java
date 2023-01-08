package com.faleicadev.workshopmongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faleicadev.workshopmongo.domain.User;
import com.faleicadev.workshopmongo.repository.UserRepository;
import com.faleicadev.workshopmongo.service.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;	
	
	public List<User> findAll(){
		return userRepo.findAll();	
	}
	
	public User findById(String id) {
		User user = userRepo.findById(id).get();
		if (user == null) {
			throw new ObjectNotFoundException("Objeto não encontrado");
			
		}
		return user;
		
	}

}
