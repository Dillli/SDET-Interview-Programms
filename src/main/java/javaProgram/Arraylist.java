package javaProgram;

import java.util.ArrayList;



public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("CNU");
		a.add("RAJU");
		a.add("KALI");
		System.out.println(a);
		//a.add(index, element);
		a.add(2, "GOPI");
		System.out.println(a);
		a.remove(0);
		System.out.println(a.get(2));
		System.out.println(a.contains("SELENIUM"));//searching an element
		a.add("RAJU");//allows duplicate avlues
		System.out.println(a);
		System.out.println(a.indexOf("GOPI"));
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		a.add(0, "student");
		System.out.println(a);
	}

}
