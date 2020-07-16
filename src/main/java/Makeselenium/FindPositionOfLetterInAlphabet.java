package Makeselenium;

public class FindPositionOfLetterInAlphabet {

	public static int findPosition(char inputLetter)
	{
		// converting input letter in to uniform case.
		
		char inputLetterToLowerCase= Character.toLowerCase(inputLetter);
		
		// COnverting char  in to its ascii value
		
		int asciiValueOfinputChar= (int)inputLetterToLowerCase;
		
		// ASCII value of lower case letters starts from 97
		int position= asciiValueOfinputChar-96;
		
		System.out.println(" char position "+position );
		
		return position;
		
	}
	public static void main(String[] args) {
		
	
		findPosition('G');
       
		
	}
}

