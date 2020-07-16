package Makeselenium;

public class FindDistinctCharInString {

	public static void findPrintDistinctCharInString(String inputString) {

		System.out.println("You entered: " + inputString);

		// Converting input string to upper case
		inputString = inputString.toUpperCase();

		// Removing all white spaces
		inputString = inputString.replace(" ", "");

		// We need to keep counting char till its length is greater than 0

		while (inputString.length() > 0) {

			// Extracting first char
			char c = inputString.charAt(0);
			/*
			 * lastIndexOf(char c) method of String class gives the index of
			 * last occurrence of char in given string. If a character is not
			 * repeated in given string,&nbsp; lastIndexOf should give zero as
			 * we took first char to check. If it is zero, print.
			 */
			if (inputString.lastIndexOf(c) == 0)
				System.out.print(c + " ");

			// Remove char whose occurrence is checked
			inputString = inputString.replace(Character.toString(c), "");
		}

	}

	public static void main(String[] args) {

		findPrintDistinctCharInString(" dileep lasya vamshi pinky");
	}

}
