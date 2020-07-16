package javaProgram;

public class RemoveJunkChars {

	public static void main(String[] args) {
	
		String s = "样品 hel$lo 12&4356 样品 world";
		//Regular Expression: (^a-zA-Z0-9) - except these
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		
		
		
		

	}

}
