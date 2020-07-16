package javaProgram;

import java.util.ArrayList;
import java.util.HashSet;

public class AmazonUnique {

	public static void main(String[] args) {
		int a[] = { 2, 5, 3, 5, 2, 4, 4, 7, 3, 2, 5 };
		/*
		 * for(int i=0;i<a.length;i++){ int k=0,j=0; while(j<a.length){ int
		 * search=a[i]; if(search==a[j]){ k++; } j++;
		 * System.out.println(a[i]+" is found "+k+" times"); } }
		 */
		
		System.out.println(a[1]);
		
		System.out.println("**************");
		ArrayList<Integer> ab = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			int k = 0;
			if (!ab.contains(a[i])) {// becomes true-doesn't allows
				ab.add(a[i]);	
				k++;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						k++;
					}
				}
				System.out.println(a[i] + " repeated " + k + " times");
				if (k == 1)
					System.out.println(a[i] + " is unique number");
			}
		}
	}
}
