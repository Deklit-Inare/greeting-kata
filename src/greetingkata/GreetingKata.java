package greetingkata;

public class GreetingKata {

	public static void main(String[] args) {

		System.out.println(border(greet("easter", "Sasha"), 80));

	}

	public static String border(String message, int size) {

		String border = "";

		for (int i = 0; i < size; i++) {
			border += "*";
		}

		String spacesBefore = spacesBefore(message, size);
		String spacesAfter = spacesAfter(message, size, spacesBefore);
		String emptyLine = getEmptyLine(size);

		return border + "\n" + emptyLine + "\n* " + spacesBefore + message + spacesAfter + "*\n" + emptyLine + "\n" + border;

	}

	private static String spacesBefore(String message, int size) {
		String spacesBefore = "";

		for (int i = 0; i < (size - message.length() - 3) / 2; i++) {
			spacesBefore += " ";
		}
		return spacesBefore;
	}

	private static String spacesAfter(String message, int size, String spacesBefore) {
		String spacesAfter = "";

		for (int i = 0; i < size - message.length() - spacesBefore.length() - 3; i++) {
			spacesAfter += " ";
		}
		return spacesAfter;
	}

	private static String getEmptyLine(int size) {
		String emptyLine = "*";
		for (int i = 0; i < size - 2; i++) {
			emptyLine += " ";
		}
		return emptyLine + "*";
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
