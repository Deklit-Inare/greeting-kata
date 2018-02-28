package greetingkata;

public class GreetingKata {

	public static void main(String[] args) {

		System.out.println(border(greet("easter"), 80));

	}

	public static String border(String message, int size) {

		String border = "";

		for (int i = 0; i < size; i++) {
			border += "*";
		}

		String spaces = "";
		
		for(int i = 0; i < size - message.length() - 3; i++) {
			spaces += " ";
		}
		
		return border + "\n* " + message + spaces + "*\n" + border;

	}

	public static String greet(String greeting) {

		return greet(greeting, "my friend");

	}

	public static String greet(String greeting, String name) {

		switch (greeting) {

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
