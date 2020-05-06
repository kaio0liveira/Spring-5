package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repositories.RepositoryUser;

@Controller
public class UserController {
		
	private RepositoryUser userRepository;
	
	
	public UserController(RepositoryUser userRepository) {
		this.userRepository = userRepository;
	}
	
	@RequestMapping("/users")
	public String getUsers(Model model ) {
		model.addAttribute("usersList", this.userRepository.findAll());
		
		
		return "user";
	}
}
