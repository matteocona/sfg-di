package it.teoprogramming.sfidi.controllers;

import it.teoprogramming.sfidi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller // @Controller at class level
public class SetterInjectedController {

	private GreetingService greetingService;

	@Qualifier("setterInjectedGreetingService") // added qualifier
	@Autowired // @Autowired at setter level
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}