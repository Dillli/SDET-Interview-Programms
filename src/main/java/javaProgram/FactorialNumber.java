package javaProgram;

public class FactorialNumber {

	public static void main(String[] args) {
		System.out.println("factorial of 1 using recursion : " + factorial(1));
		System.out.println("factorial of 1 using iteration : " + factorial(1L));

		System.out.println("factorial of 5 using recursion : " + factorial(5));
		System.out.println("factorial of 5 using loop : " + factorial(5L));

		System.out.println("factorial of 7 using recursive algorithm : " + factorial(7));
		System.out.println("factorial of 7 using iterative algorithm : " + factorial(7L));

	}

	public static long factorial(int number) {
		// base case - factorial of 0 or 1 is 1
		if (number <= 1) {
			return 1;
		}
		return number * factorial(number - 1);
	}

	public static long factorial(long input) {
		long factorial = 1L;
		for (long i = input; i > 0; i--) {
			factorial = factorial * i;
		}

		return factorial;
	}
}
