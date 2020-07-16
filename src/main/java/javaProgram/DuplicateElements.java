package javaProgram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		
		String names [] = {"C","Java","Javascript","Python","C","Java","Ruby"}; //case sensitive
		
		//1.comparing each element - worst case - Time complexity -O(n*2)
		for(int i=0;i<names.length;i++) {
			for(int j=i+1;j<names.length;j++) {
				if(names[i].equals(names[j]))
				System.out.println("Duplicate element is: "+names[i]);
			}
		}
		System.out.println("************");
		
		//2.using Hashset - part of Java collections -stores unique values - O(n)
		Set<String> store = new HashSet<String>();
		for(String name : names) { //looping of names array
			if(store.add(name) == false) { // checking whether the names values adding or not to hashset	
				System.out.println("Duplicate element is: "+name);
			}
		}
		System.out.println("************");
		//3.using Hashmap - O(2n)
		Map<String,Integer> storeMap = new HashMap<String,Integer>();
		for(String name : names) {
			Integer count = storeMap.get(name);
			if(count == null) {
				storeMap.put(name,1);
			}
			else {
				storeMap.put(name, ++count);
			}
		}
		
		//get the values from the hashmap
		Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
		for(Entry<String, Integer> entry : entrySet) {
			if(entry.getValue()>1) {
				System.out.println("Duplicate value is: "+entry.getKey());
			}
		}
		
	}

}
