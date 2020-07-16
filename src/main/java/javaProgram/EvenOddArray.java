package javaProgram;

import java.util.ArrayList;

public class EvenOddArray {

	public static void main(String[] args) {

		int[] numbers = { 7, 9, 8, 3, 1, 2, -23, 0, 8 };
		System.out.println("Given Array values: ");
		print(numbers);
		System.out.println("1. Using ArrrayList: ");
		UsingArrayList(numbers);
		System.out.println("2. Using Array: ");
		UsingArray(numbers);
	}

	public static void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void UsingArrayList(int[] array) {
		ArrayList<Integer> evenlist = new ArrayList<Integer>();
		ArrayList<Integer> oddlist = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				evenlist.add(array[i]);
			} else {
				oddlist.add(array[i]);
			}
		}
		System.out.println("Even list " + evenlist);
		System.out.println("Odd list " + oddlist);
	}

	public static void UsingArray(int[] array) {
		int counter = 0, counter2 = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				counter++;
			} else {
				counter2++;
			}
		}

		int[] even = new int[counter];
		int[] odd = new int[counter2];
		int j = 0, k = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				even[j] = array[i];
				j++;
			} else {
				odd[k] = array[i];
				k++;
			}
		}
		print(even);
		print(odd);
	}

}
