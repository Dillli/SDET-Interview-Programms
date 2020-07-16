package Makeselenium;

public class Removewhitespace {

	public static void main(String[] args) {
		removeExtraWhitespace(" wejmned yuhjjcwece uyjcwde sdadhjn");

	}

	public static String removeExtraWhitespace(String str) {

		System.out.println("You entered with spaces: \"" + str + "\"");

		// Convert given string to a char array
		char[] c = str.toCharArray();

		// Output string variable
		String stringWithoutExtraWhitespaces = "";

		// For loop
		for (int i = 0; i < str.length(); i++) {

			// If current char is a whitespace, check for next char
			if (c[i] == ' ') {

				if (!(stringWithoutExtraWhitespaces.length() == 0)) {
					// Check if next char is a non space. If yes, append in
					// existing string.
					if (c[i + 1] != ' ') {
						stringWithoutExtraWhitespaces = stringWithoutExtraWhitespaces + c[i];
					}
				}

			}
			// Else append in new string stringWithoutExtraWhitespaces
			else
				stringWithoutExtraWhitespaces = stringWithoutExtraWhitespaces + c[i];

		}
		System.out.println(" stringWithoutExtraWhitespaces :" + stringWithoutExtraWhitespaces);

		return stringWithoutExtraWhitespaces;

	}

}
