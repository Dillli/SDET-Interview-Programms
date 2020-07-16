package JavaInterviewPrograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsIntArray {

	static int[] arr = new int[] { 1789, 2035, 1899, 1456, 2013, 1458, 2165, 1254, 1472, 2365, 1456, 2165, 1457, 2456 };

	public static void main(String[] args) {

		Set<Integer> store = new HashSet<Integer>();

		for (Integer name : arr) {
			if (store.add(name) == false) {
				System.out.println("duplicate element is::" + name);
				
			}
			
		}
		System.out.println("with out duplicates :" + store);
	}
}
