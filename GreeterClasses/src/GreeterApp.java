import java.util.Scanner;

public class GreeterApp {

	public static void main(String[] args) {
		
		String greeting;
		String name;
		String htmlTag;
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Hello there. Please enter your preferred greeting: ");
		greeting = scnr.nextLine();
		System.out.print("Thank you. Now enter your name: ");
		name = scnr.next(); 
		System.out.print("Now enter an html tag you'd like to use: ");
		htmlTag = scnr.next();
		
		Greeter firstGreeter = new Greeter(greeting);
		System.out.println(firstGreeter.greet(name));
		
		SimonGreeter secondGreeter = new SimonGreeter(greeting);
		System.out.println(secondGreeter.greet(name));
		
		LoudGreeter thirdGreeter = new LoudGreeter(greeting);
		thirdGreeter.addVolume();
		System.out.println(thirdGreeter.greet(name));
		
		HtmlGreeter fourthGreeter = new HtmlGreeter(greeting, htmlTag);
		System.out.println(fourthGreeter.greet(name));
		
	}

}
