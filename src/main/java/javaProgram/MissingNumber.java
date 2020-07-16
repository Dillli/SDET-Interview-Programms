package javaProgram;

public class MissingNumber {

	public static void main(String[] args) {
		//finding missing number in an continuous sequence sorted array
		int a[] = {1,2,3,4,5,7,8,9};
		
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum = sum + a[i]; //adding all the numbers in the array - missed 6
		}
		System.out.println(sum);
		int sum1=0;
		for(int j=1;j<=9;j++) {
			sum1 = sum1 + j ; //adding from 1 to 9
		}
		System.out.println(sum1);
		
		System.out.println("Missing no is "+(sum1-sum));
		
		
		//int a[] = {-1,0,1,2,4,5,7,8,9}; - 3 is missing -loop upto 9 from -1
		//int a[] = {1,2,3,4,5,6,7,8,9}; - boumdary value 10 is missing loop from 1 to 10
		
		
		
	}

}
