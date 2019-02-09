package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.domain.PostRepository;



@Controller
@RequestMapping("/posts")
public class PostController {
	
	@Autowired
	PostRepository repository;
	
	@RequestMapping(value="",method=RequestMethod.GET)
	public String listPost(Model model) {
		model.addAttribute("posts",repository.findAll());
		return "posts/list";
	}
}