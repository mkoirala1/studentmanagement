package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Coaches {

@Value("${coach.name}")
private String coachName;

@Value("${coach.team}")
private String teamName;

@GetMapping("/teaminfo")
public String teaminfo() {
	return coachName+" "+teamName;
}

}
