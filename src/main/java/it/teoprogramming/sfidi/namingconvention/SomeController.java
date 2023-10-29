package it.teoprogramming.sfidi.namingconvention;

public class SomeController {
	private final MyService myService;

	public SomeController(MyService myService) {
		// here Spring can inject whichever implementation we want
		this.myService = myService;
	}
}
