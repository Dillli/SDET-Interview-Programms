package JavaInterviewPrograms;

import java.util.HashSet;
import java.util.Set;

public class NumberDuplicatesusingSET {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 5, 6, 6, 7 };

		Set<Integer> hs = new HashSet<Integer>();

		for (int x : arr) {

			if (!hs.add(x)) {

				System.out.println("Duplicate number" + x);
			}
		}
		
		
		
		String names[] = { "Java", "JavaScript", "Ruby", "C", "Python", "Java" };

		System.out.println("*********");

		// 2. using HashSet: Java Collection: it stores unique values: O(n)
		Set<String> store = new HashSet<String>();
		for (String name : names) {
			if (!store.add(name)) {
				System.out.println("duplicate element is::" + name);
			}
		}

	}

}
