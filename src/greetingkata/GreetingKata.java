package greetingkata;

public class GreetingKata {

	public static void main(String[] args) {
		
		System.out.println(border(greet("easter", "Sasha"), 80));
		
	}
	
	public static String border(String message, int size) {
		
		String border = "";
		
		for(int i = 0; i < size; i++) {
			border += "*";
		}
		
		return border + "\n" + message + "\n" + border;
		
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
