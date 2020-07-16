package javaProgram;

import java.util.Scanner;

/*
 * Java Program to calculate sum of array elements
 * input = [1, 2, 3, 4, 5, 6]
 * output = 21
 */

public class ArraySum {
	public static void main(String[] args) {

		  System.out.println("Welcome to Java program to calculate sum of elements in an array");
		  System.out.println("Please enter the length of array?");

		  Scanner scnr = new Scanner(System.in);
		  int length = scnr.nextInt();
		  int[] input = new int[length];

		  System.out.println("Please enter elements of array");
		  for (int i = 0; i < length; i++) {
		  input[i] = scnr.nextInt();
		  }

		  int total = sumOfElements(input);
		  System.out.println("Sum of all elements of array is " + total);
		  scnr.close();
		  }

		  /**
		  * A Java method to run sum of all elements of given array
		  * 
		  * @param array
		  * @return sum of all elements of int array
		  */
		  public static int sumOfElements(int[] array) {
		  int sum = 0;
		  for (int i : array) {
		  sum = sum + i;
		  }
		  return sum;
		  }
}
