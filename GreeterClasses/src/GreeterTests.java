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
	
	@Test
	void testSimonGreeterGreeting1() {
		SimonGreeter greet1 = new SimonGreeter("Hi");
		assertEquals("Simon Says, \"Hi, John!\"", greet1.greet("John"));
	}
	
	@Test
	void testSimonGreeterGreeting2() {
		SimonGreeter greet1 = new SimonGreeter("Hello there");
		assertEquals("Simon Says, \"Hello there, Franklin!\"", greet1.greet("Franklin"));
	}
	
	@Test
	void testLoudGreeterAddVolume1() {
		LoudGreeter greet1 = new LoudGreeter("Hi");
		greet1.addVolume();
		assertEquals("Hi, John!!!", greet1.greet("John"));
	}
	
	@Test
	void testLoudGreeterAddVolume2() {
		LoudGreeter greet1 = new LoudGreeter("Hi");
		greet1.addVolume();
		greet1.addVolume();
		greet1.addVolume();
		greet1.addVolume();
		assertEquals("Hi, John!!!!!!", greet1.greet("John"));
	}
	
	@Test
	void testHtmlGreeterConstructor1() {
		HtmlGreeter greet1 = new HtmlGreeter("Hello there");
		assertEquals("<h1>Hello there, Franklin!<h1>", greet1.greet("Franklin"));
	}
	
	@Test
	void testHtmlGreeterConstructor2() {
		HtmlGreeter greet1 = new HtmlGreeter("Hello there", "a");
		assertEquals("<a>Hello there, Franklin!<a>", greet1.greet("Franklin"));
	}
	

}
