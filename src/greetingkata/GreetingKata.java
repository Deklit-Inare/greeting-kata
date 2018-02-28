package greetingkata;

public class GreetingKata {

	public static void main(String[] args) {

		System.out.println(border(greet("easter", "Sasha"), 80, 2));

	}
	
	public static char borderChar = '#';

	public static String border(String message, int size, int thickness) {

		String border = sideBorder(size);

		String spacesBefore = spacesBefore(message, size, thickness);
		String spacesAfter = spacesAfter(message, size, thickness, spacesBefore);
		String emptyLine = getEmptyLine(size, thickness);
		String sideBorder = sideBorder(thickness);
		
		String out = "";
		
		for(int i = 0; i < thickness; i++) {
			out += border + "\n";
		}
		out += emptyLine + "\n";

		out += sideBorder + spacesBefore + message + spacesAfter + sideBorder + "\n";
		
		
		out += emptyLine + "\n";
		for(int i = 0; i < thickness; i++) {
			out += border + "\n";
		}
		
		
		return out;
		//return border + "\n" + emptyLine + "\n" + borderChar + " " + spacesBefore + message + spacesAfter + borderChar + "\n" + emptyLine + "\n" + border;

	}

	private static String spacesBefore(String message, int size, int thickness) {
		String spacesBefore = "";

		for (int i = 0; i < size/2 - thickness - message.length()/2; i++) {
			spacesBefore += " ";
		}
		return spacesBefore;
	}

	private static String spacesAfter(String message, int size, int thickness, String spacesBefore) {
		String spacesAfter = "";

		for (int i = 0; i < size - message.length() - spacesBefore.length() - 2*thickness; i++) {
			spacesAfter += " ";
		}
		return spacesAfter;
	}

	private static String getEmptyLine(int size, int thickness) {
		String border = sideBorder(thickness);
		
		String emptyLine = "";
		
		for (int i = 0; i < size - 2 * thickness; i++) {
			emptyLine += " ";
		}
		return border + emptyLine + border;
	}

	private static String sideBorder(int thickness) {
		String border = "";
		for(int i = 0; i < thickness; i++) {
			border += borderChar;
		}
		return border;
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
