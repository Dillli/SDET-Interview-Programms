package javaProgram;

import java.util.Scanner;

public class Guessnumber {


	public static void main (String [] args) {
		int d = 8,i=0,c;
		System.out.println("Enter a number between 1-10, Max 3 chances");
		Scanner input = new Scanner(System.in);
		for(c=0;c<3;c++){
			System.out.println("chances left: "+(3-c));
				i = input.nextInt();
				if(i>=1||i<=10) {
					if(i<d) {
						System.out.println("The number you entered is lessthan default number");
					}
					else if(i>d) {
						System.out.println("The number you entered is greaterthan default number");
					}
					else {
						System.out.println("Hurray! entered numeber is matched with default number");
					}
				}
				else{
					System.out.println("entered number is not between 1-10");
				}
		}
		if(c==3)
			System.out.println("Max limit has been reached");
		input.close();
	}
}
