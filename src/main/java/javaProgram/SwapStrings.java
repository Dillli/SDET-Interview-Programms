package javaProgram;

public class SwapStrings {

	public static void main(String[] args) {

		//WAP to swap two strings without using third variable
		String a = "hello";
		String b = "world!";
		
		System.out.println("Before swapping:a= "+a+" b="+b);
		
		//1.append a and b
		a = a + b; //helloworld!
		//2.store initial string a in string b
		b = a.substring(0, a.length()-b.length());//0to11-5=hello
		//a.length()->rigth click and watch to know the length in debug mode
		//3.store initial string b in a
		a = a.substring(b.length());//from 5=world!
		
		
		System.out.println("After swapping:a= "+a+" b="+b);
		
		
		
	}

}
