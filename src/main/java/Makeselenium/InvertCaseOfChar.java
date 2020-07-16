package Makeselenium;

public class InvertCaseOfChar {
	
	public static String invertCaseOfString(String input)
	
	
	{
		
		System.out.println("Input stirng : "+input);
		
		// Converting string to char array
		
		char[] charsInput = input.toCharArray();
		
		// Iterating each char of string
		for(int i =0; i< charsInput.length ; i++)
		{
			// Check if current char is uppercase. Note it will give false for numbers and special chars.
			if(Character.isUpperCase(charsInput[i]))
				// If upper case, convert to lowercase
				charsInput[i] = Character.toLowerCase(charsInput[i]);
			else
				// If not uppercase, it will be changed to lowercase. 
				// If we add another if condition to check if char is lowercase, that will make program
				// more optimal.
				charsInput[i] = Character.toUpperCase(charsInput[i]);				
				
		}
// Converting char array to string		
return new String(charsInput);
	
}
	
	public static void main(String[] args) {
		
	
		
		System.out.println("Output string : "+invertCaseOfString("dilReddylasVAMAmmanannA"));
		
	}
 

}
