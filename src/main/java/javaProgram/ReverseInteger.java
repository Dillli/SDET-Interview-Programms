package javaProgram;

public class ReverseInteger {

	public static void main(String[] args) {
		//store in long coz int size is limited
		
		//1/using alogorithm
		int num = 12345; //divident
		int rev = 0;
		while(num!=0) {
			rev = rev * 10 + num % 10; //reminder
			num = num / 10; //quotient - 1- divisor
		}
		
		System.out.println(rev);
		
		//2.using StringBuffer method
		long s = 987654321;
		System.out.println(new StringBuffer(String.valueOf(s)).reverse());
		
		
		
		
	}

}
