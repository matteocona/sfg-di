package it.teoprogramming.sfidi.controllers;

import it.teoprogramming.sfidi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {
	ConstructorInjectedController controller;

	@BeforeEach
	void setUp() {
		// Here, I'm mimicking what the Spring Framework could be doing.
		controller = new ConstructorInjectedController(new ConstructorGreetingService());
	}

	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}
}