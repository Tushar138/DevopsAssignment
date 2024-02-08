package com.training.nagarro.devops.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

class HomeControllerTest {

	@Test
	void testWelcomeMessage() {
		HomeController homeController = new HomeController();

        Map<String, Object> response = homeController.welcomeMessage();

        assertEquals("Welcome to devops assignment, Rest api end point is working fine", response.get("Message"));
        assertEquals(true, response.get("Success"));
        assertEquals(HttpStatus.OK, response.get("Status"));
	}

}
