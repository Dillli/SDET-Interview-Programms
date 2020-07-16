package Makeselenium;

public class FindLengthOfStringWithoutLengthMethod {

	// Method to find length of given string without length method
	
	public static int getLengthWithoutLengthMethod(String input) {
		
		// lastIndexOf("") will give us length of string.
		int position = input.lastIndexOf("");

		System.out.println(" String length :" + position);

		return position;
	}

	public static void main(String[] args) {

		getLengthWithoutLengthMethod("rambabu");

	}

}
