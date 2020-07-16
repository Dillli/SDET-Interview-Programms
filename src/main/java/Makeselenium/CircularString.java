package Makeselenium;

public class CircularString {

	static int sum = 0;

	public static void main(String[] args) {

		stringnum("make selenium  easy", 0);

	}

	public static void stringnum(String str, int index) {

		String ai[] = str.split(" ");

		System.out.println(" Spilt string lenghth " + ai.length);

		// validation for acceptable index
		// index should be grater than or equal to zero and less than length of array
	

		if (index >= 0 && index < ai.length) {

			System.out.println("output :");

			
			// Printing from given index till last index
			
			for (int i = index; i < ai.length; i++) {

				System.out.print(ai[i] + " ");
			}

			// printing from index zero to position -1

			for (int k = 0; k < index; k++) {
				System.out.print(ai[k] + " ");
			}
		}

		else {

			System.out.println(" out of index");
		}

	}

}
