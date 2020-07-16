package Makeselenium;

public class CapitaliseFirstCharOfWords {

	
	public static String CapitaliseCharOfWords(String sentence) {
		
		System.out.println("Given sentence: " + sentence);
		 
		// Extract all words
		String words[] = sentence.split("\\s+");
		
		// Creating an empty string of type StringBuilder so that modification of string is possible.
		StringBuilder sb = new StringBuilder();
		
		// Iterating through words
		for (String word : words) {
			
			//Extracting first char
			char firstChar = word.charAt(0);
			
//			Character.isUpperCase(charsInput[i]
//					
//					!Character.isUpperCase(firstChar)
		
			
			// Checking if firstchar is not in upper case already
			if (!!Character.isUpperCase(firstChar)) {
				// Convert first char into upper case and then append remaining characters of words. 
				sb.append(Character.toUpperCase(firstChar)).append(word.substring(1));
			} else
				sb.append(word.substring(0));
			
			// Appending space after each word
			sb.append(" ");
		}
		
		// Converting StringBuilder to String. trim() is needed to trim last space appended. 
		String result = sb.toString().trim();
		
		System.out.println("Output is :" + result);
		
		return result;
		
	}
 
	public static void main(String[] args) {
 
		CapitaliseCharOfWords("selen gth yuu jhjhh ");
	}
}
