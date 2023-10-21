package it.teoprogramming.sfidi;

import it.teoprogramming.sfidi.controllers.ConstructorInjectedController;
import it.teoprogramming.sfidi.controllers.I18nController;
import it.teoprogramming.sfidi.controllers.MyController;
import it.teoprogramming.sfidi.controllers.PropertyInjectedController;
import it.teoprogramming.sfidi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfiDiApplication {

	public static void main(String[] args) {

		//ConfigurableApplicationContext run = SpringApplication.run(SfiDiApplication.class, args);
		//ConfigurableApplicationContext extends ApplicationContext
		ApplicationContext ctx = SpringApplication.run(SfiDiApplication.class, args);

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		MyController myController = (MyController) ctx.getBean("myController");
		// non ho fatto la new dell'oggetto.
		// Ho richiesto l'oggetto allo Spring Context / Application Context.

		// It is how the Inversion of Control works.
		// The Spring Framework is managing the construction of MyController.
		// I am not creating an object here, I'm asking Spring to provide an object.
		// Dependency Injection

		System.out.println("_________ Primary Bean");
		System.out.println(myController.sayHello());

		// The application stops because there is not a web server configured.
		// We have only print on the console.

		System.out.println("_________ Property injected controller");
		PropertyInjectedController propertyInjectedController =
				(PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("_________ Setter injected controller");
		SetterInjectedController setterInjectedController =
				(SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("_________ Constructor injected controller");
		ConstructorInjectedController constructorInjectedController =
				(ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}
}
