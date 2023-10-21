package it.teoprogramming.sfidi.services;

import org.springframework.stereotype.Service;

@Service // I added this (note the annotation here is @Service not @Controller)
public class PropertyInjectedGreetingService implements GreetingService {

	@Override public String sayGreeting() {
		return "Hello World - Property";
	}
}
