package Makeselenium;

public class ExtractNumbersFromStringAndAdd {

	static int sum = 0;

	public static void main(String[] args) {
		
		stringnum("dieep15714682");

	}

	public static void stringnum(String str) {

		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);

			if (Character.isDigit(c)) {
				
				sum = sum + Character.getNumericValue(c);
			
			}
			
		}
		
		System.out.println("With numbers Sting  :"+ str);
		System.out.println("Sum of numbers found in " + str + " :" + sum);
		
	}
	
	

}
