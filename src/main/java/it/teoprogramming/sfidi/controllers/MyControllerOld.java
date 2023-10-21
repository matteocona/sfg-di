package it.teoprogramming.sfidi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyControllerOld {
	public String sayHello() {
		System.out.println("Hello World!!!");
		return "Hi Folks!";
	}
}
