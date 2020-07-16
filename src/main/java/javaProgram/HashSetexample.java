package javaProgram;

import java.util.*;

public class HashSetexample {

	public static void main(String[] args) {
		// Hashset,LinkedHAshset,Treeset
		//set -doesn't accept duplicate values
		//there is no gaurantee elements stored in sequential(list) order(stores randomly)
		HashSet<String> hs = new HashSet<String>();
		hs.add("HELLO");
		hs.add("WELCOME");
		hs.add("GOOD MORNING");
		hs.add("HELLO");//wont consider duplicate values to store
		hs.add("HI");
		hs.add("CNU");
		hs.add("KUMAR");
		hs.add("SEA");
		
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		hs.remove("HELLO");
		System.out.println(hs.size());
		//prints random indexed elements
		System.out.println(hs);
		
		//Iterator
		Iterator<String> it = hs.iterator();//from java.util
		System.out.println(it.next());//control comes to index 0 from base
		System.out.println(it.next());
		System.out.println(it.next());
		//prints in sequential order
		while(it.hasNext()){
			System.out.println(it.next());
			
		}
	}

}
