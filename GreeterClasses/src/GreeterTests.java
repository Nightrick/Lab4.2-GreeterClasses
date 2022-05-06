import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreeterTests {

	@Test
	void testGreetingSetFromParameter() {
		Greeter greet1 = new Greeter("Hi");
		assertEquals("Hi", greet1.getGreeting());
	}
	
	@Test
	void testGreetMethod() {
		Greeter greet1 = new Greeter("Hi");
		assertEquals("Hi, John!", greet1.greet("John"));
	}
	
	@Test
	void testGreeterSetter() {
		Greeter greet1 = new Greeter("Hi");
		greet1.setGreeting("Bye");
		assertEquals("Bye", greet1.getGreeting());
	}

}
