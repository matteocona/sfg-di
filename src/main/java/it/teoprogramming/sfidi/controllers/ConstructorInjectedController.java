package it.teoprogramming.sfidi.controllers;

import it.teoprogramming.sfidi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller // @Controller annotation
public class ConstructorInjectedController {
	private final GreetingService greetingService;

	// The @Autowired annotation on constructors now is optional
	public ConstructorInjectedController(@Qualifier("constructorGreetingService") // added qualifier
											GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}