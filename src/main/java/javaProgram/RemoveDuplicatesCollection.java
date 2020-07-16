package javaProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesCollection {
	//1.Using Iterator
	 // Function to remove duplicates from an ArrayList 
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) 
    { 
  
        // Create a new ArrayList 
        ArrayList<T> newList = new ArrayList<T>(); 
  
        // Traverse through the first list 
        for (T element : list) { 
  
            // If this element is not present in newList 
            // then add it 
            if (!newList.contains(element)) { 
  
                newList.add(element); 
            } 
        } 
  
        // return the new list 
        return newList; 
    } 
  //  2.Using LinkedHashSet
 // Function to remove duplicates from an ArrayList 
    public static <T> ArrayList<T> removeDuplicates2(ArrayList<T> list) 
    { 
  
        // Create a new LinkedHashSet 
        Set<T> set = new LinkedHashSet<>(); 
  
        // Add the elements to set 
        set.addAll(list); 
  
        // Clear the list 
        list.clear(); 
  
        // add the elements of set 
        // with no duplicates to the list 
        list.addAll(set); 
  
        // return the list 
        return list; 
    } 
    
	public static void main(String[] args) {
		// Get the ArrayList with duplicate values 
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5)); 
  
        // Print the Arraylist 
        System.out.println("ArrayList with duplicates: "+ list); 
  
        // Remove duplicates 
        ArrayList<Integer> newList = removeDuplicates(list); 
  
        // Print the ArrayList with duplicates removed 
        System.out.println("ArrayList with duplicates removed: "+ newList); 
        
     //using LinkedHashSet
        System.out.println("ArrayList with duplicates: "+ list);
        // Remove duplicates 
        ArrayList<Integer> newList2 = removeDuplicates2(list); 
  
        // Print the ArrayList with duplicates removed 
        System.out.println("ArrayList with duplicates removed: " + newList2); 
    } 
	

}
