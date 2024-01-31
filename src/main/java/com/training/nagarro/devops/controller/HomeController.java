package com.training.nagarro.devops.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/welcomeMessage")
	public Map<String, Object> welcomeMessage(){
		Map<String, Object> response=new HashMap<>();
		response.put("Message", "Welcome to devops assignment rest api end point is working fine");
		response.put("Success", true);
		response.put("status", HttpStatus.OK);
		return response;
	}
}
