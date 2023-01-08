package com.faleicadev.workshopmongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faleicadev.workshopmongo.domain.User;
import com.faleicadev.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;	
	
	public List<User> findAll(){
		return userRepo.findAll();	
	}

}
