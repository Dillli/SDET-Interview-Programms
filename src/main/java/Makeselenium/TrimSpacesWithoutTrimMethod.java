package Makeselenium;

import org.apache.poi.util.SystemOutLogger;

public class TrimSpacesWithoutTrimMethod {

	public static void main(String[] args) {

		Whitouttrim("         Make Selenium Easy      ");
	}

	public static void  Whitouttrim(String str) {

		int startIndex = 0;
		int lastIndex = 0;

		for (int i = 0; i < str.length(); i++) {
			
		char[] c = str.toCharArray();

			
			if(c[i]!=' '){
			 
				
				lastIndex =i;
				
		}
			
		

	
		
	}
		System.out.println("After  trim the  string "+str.substring(startIndex, lastIndex + 1));
	}
	}
