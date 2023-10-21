package it.teoprogramming.sfidi.controllers;

import it.teoprogramming.sfidi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

	@Qualifier("propertyInjectedGreetingService") // added qualifier
	@Autowired // I added autowired
	public GreetingService greetingService; // Perche' public?
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
