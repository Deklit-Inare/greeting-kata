package greetingkata;

public class GreetingKata {

	public static void main(String[] args) {
		
		System.out.println(greet("morning", "Sasha") + "\n" + greet("easter", "Pacal"));
		
	}
	
	public static String greet(String greeting, String name) {
		
		switch(greeting) {
		
		case "morning":
			greeting = "Good morning";
			break;
			
		case "easter":
			greeting = "Happy Easter";
			break;
			
		default:
			break;
		
		}
		
		return String.format("%s, %s!", greeting, name);
		
	}

}
