package javaProgram;

import java.util.Arrays;

public class LargestSmallestNumbers {

	public static void main(String[] args) {

		int numbers [] = {2, -18, 43, 0, -67, 8938};
		
		int largest = numbers[0];
		int smallest = numbers[0];
		
		//Time complexity - O(n)
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]>largest) {
				largest = numbers[i];
			}
			else if(numbers[i]<smallest) {
				smallest = numbers[i];
			}
		}
		System.out.println("Array is: "+Arrays.toString(numbers));
		System.out.println("largest no is: "+largest+" Smallest no is: "+smallest);
		
		
		
		
		
	}

}
