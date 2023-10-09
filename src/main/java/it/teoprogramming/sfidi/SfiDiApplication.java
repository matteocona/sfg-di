package it.teoprogramming.sfidi;

import it.teoprogramming.sfidi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SfiDiApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext run = SpringApplication.run(SfiDiApplication.class, args);

		MyController myController = (MyController) run.getBean("myController");
		// non ho fatto la new dell'oggetto.
		// Ho richiesto l'oggetto allo Spring Context / Application Context.

		// It is how the Inversion of Control works.
		// The Spring Framework is managing the construction of MyController.
		// I am not creating an object here, I'm asking Spring to provide an object.
		// Dependency Injection


		String greetings = myController.sayHello(); // prints "Hello World!!!" and returns "Hi Folks!"
		System.out.println(greetings);

		// The application stops because there is not a web server configured.
		// We have only print on the console.
	}
}
