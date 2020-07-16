package javaProgram;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * Java Program to check if all characters of String are unique. 
 */
public class UniquecharsInString {
	public static void main(String[] args){
	 // create Scanner to read user input
    Scanner sc = new Scanner(System.in);

    System.out.println("Please enter a String");
    String input = sc.nextLine();

    if (isUnique(input)) {
      System.out.println("All characters of String are unique");
    } else {
      System.out.println("All characters of String are not unique");
    }

    sc.close();
}

  /**
   * Returns true if all characters of given String are unique
   * 
   * @param input
   * @return true if no duplicate characters
   */
  public static boolean isUnique(String input) {
    // Create a Set to insert characters
    Set<Character> set = new HashSet<>();

    // get all characters form String
    char[] characters = input.toCharArray();

    for (Character c : characters) {
      if (!set.add(c)) {
        return false;
      }
    }
    return true;
  }
}