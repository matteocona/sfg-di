package it.teoprogramming.sfidi.services;

import org.springframework.stereotype.Service;

@Service // @Service annotation
public class SetterInjectedGreetingService implements GreetingService {
	@Override public String sayGreeting() {
		return "Hello World - Setter";
	}
}
