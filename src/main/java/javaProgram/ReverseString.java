package javaProgram;

public class ReverseString {

	public static void main(String[] args) {
		//string class is immutable(not changeable) object- o, it doesn't contains s.reverse method
		//Reverse a string
		String s= "Selenium";
		
		//1.using for loop
		int len = s.length(); //8
		String rev = "";
		//index starts from 0
		for(int i=len-1;i>=0;i--) {
			rev = rev + s.charAt(i); //appending single chars to rev string
		}
		System.out.println(rev);
		
		//2.using StringBuffer class - immutable class
		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());
		
		
		
		
	}

}
