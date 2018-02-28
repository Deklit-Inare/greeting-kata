package greetingkata;

public class GreetingKata {

	public static void main(String[] args) {
		
		System.out.println(greet("Sasha") + "\n" + greet("Pacal"));
		
	}
	
	public static String greet(String name) {
		
		return String.format("Good morning, %s!", name);
		
	}

}
