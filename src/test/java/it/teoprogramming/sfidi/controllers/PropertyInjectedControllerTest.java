package it.teoprogramming.sfidi.controllers;

import it.teoprogramming.sfidi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {
	PropertyInjectedController controller;

	@BeforeEach
	void setUp() {
		// I am mimicking what the Spring Framework will be doing.
		controller = new PropertyInjectedController();
		controller.greetingService =  new ConstructorGreetingService();
	}

	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}
}