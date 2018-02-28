package greetingkata;

public class GreetingKata {

	public static void main(String[] args) {

		String message = greet("szulinap", "kedves Sasha");

		// int thickness = 2;
		int thickness = borderChars.length;

		int spaces = 3;

		int width = message.length() + 2 * (spaces + thickness);

		width = Math.max(80, width);

		String bordered = border(message, width, thickness);
		bordered = replaceBorderCharacters(bordered);

		System.out.println(bordered);

	}

	public static char borderChar = '|';
	public static char[] borderChars = { '*', '~'};

	public static String replaceBorderCharacters(String table) {

		String[] lines = table.split("\n");
		int width = lines[0].length();
		int height = lines.length;

		char[][] newTable = new char[width][height];

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				newTable[j][i] = lines[i].charAt(j);
			}
		}

		for (int bc = 0; bc < borderChars.length; bc++) {

			int toI = width - bc;
			int toJ = height - bc;

			for (int i = bc; i < toI; i++) {
				for (int j = bc; j < toJ; j++) {

					if (i == bc || j == bc || i == toI-1 || j == toJ-1) {
						newTable[i][j] = borderChars[bc];
					}

				}
			}
		}

		String outBorder = "";

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				outBorder += newTable[j][i];
			}
			outBorder += "\n";
		}

		return outBorder.substring(0, outBorder.length() - 1);

	}

	public static String border(String message, int size, int thickness) {

		String border = sideBorder(size);

		String spacesBefore = spacesBefore(message, size, thickness);
		String spacesAfter = spacesAfter(message, size, thickness, spacesBefore);
		String emptyLine = getEmptyLine(size, thickness);
		String sideBorder = sideBorder(thickness);

		String out = "";

		for (int i = 0; i < thickness; i++) {
			out += border + "\n";
		}
		out += emptyLine + "\n";

		out += sideBorder + spacesBefore + message + spacesAfter + sideBorder + "\n";

		out += emptyLine + "\n";
		for (int i = 0; i < thickness; i++) {
			out += border + "\n";
		}

		return out.substring(0, out.length() - 1);
		// return border + "\n" + emptyLine + "\n" + borderChar + " " + spacesBefore +
		// message + spacesAfter + borderChar + "\n" + emptyLine + "\n" + border;

	}

	private static String spacesBefore(String message, int size, int thickness) {
		String spacesBefore = "";

		for (int i = 0; i < size / 2 - thickness - message.length() / 2; i++) {
			spacesBefore += " ";
		}
		return spacesBefore;
	}

	private static String spacesAfter(String message, int size, int thickness, String spacesBefore) {
		String spacesAfter = "";

		for (int i = 0; i < size - message.length() - spacesBefore.length() - 2 * thickness; i++) {
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
		for (int i = 0; i < thickness; i++) {
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

		case "szulinap":
			greeting = "Nagyon nagyon boldog szuletesnapot kivanok sok sok szeretettel";
			break;

		default:
			break;

		}

		return String.format("%s, %s!", greeting, name);

	}

}
