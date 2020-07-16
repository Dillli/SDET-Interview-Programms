package Makeselenium;

import java.util.Arrays;
import java.util.HashSet;

public class MissingAlphabets {
	
	
	public static void main (String args[]){
		
		missing(" agfkiythjnjjyguhb  YGHJGFCTGFHKJGFCHJ  eddd  wddw cesdeseaed  eced  RDYGHJKJGFRDDRGKLIJ");
		
	}
	
	public static  void missing(String userInput ){
	
		
		
	userInput= userInput.replaceAll(" ", "");
    System.out.println("User input without spaces :"+userInput);
     
    // Creating a String array containing each character of user input
    String [] inputStringArray = userInput.split("");
     
     
    // Creating a String array containing alphabets
    String alphabets[]= "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
     
     
    // Creating HashSet to find intersections
    HashSet<String> s1 = new HashSet<String>(Arrays.asList(inputStringArray));
    HashSet<String> s2 = new HashSet<String>(Arrays.asList(alphabets));
     
    System.out.println("User Input in set :"+s1);
    System.out.println("Alphabets :"+s2);
     
    // Intersection of above sets
    s2.removeAll(s1);
     
     
    // Missing alphabets
    System.out.println("Missing alphabets :"+ s2);
	}        
     
}


