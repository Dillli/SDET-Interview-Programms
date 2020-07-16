package Makeselenium;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Dummy {
	
	
	public static String commonChars(String str1, String str2) {
	
		 Set<Character> characters1 = new TreeSet<Character>();
		    for(int i = 0; i < str1.length(); i++) {
		        characters1.add(str1.charAt(i));
		    }

		    Set<Character> characters2 = new TreeSet<Character>();
		    for(int i = 0; i < str2.length(); i++) {
		        characters2.add(str2.charAt(i));
		    }

		    characters1.retainAll(characters2);
			return characters1.toString();
		    
	}
		    
	public static void main(String[] args) {
		
		
		 
		System.out.println("Output is :" + commonChars("dileepreddy", "lasya reddy"));
	}


	}
