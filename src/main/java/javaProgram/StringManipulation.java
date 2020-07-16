package javaProgram;

public class StringManipulation {

	public static void main(String[] args) {

		String str = "The Rains have started here s";
		String str1 = "The rains have started here s";
		
		
		System.out.println("Length "+str.length());//length of the string 
		System.out.println("Char at index 5: "+str.charAt(5));//gives char at the given index- index starts from 0
		
		System.out.println("Index of char s "+str.indexOf('s'));//gives the index of 1st occurrence of the character
		System.out.println("2nd s "+str.indexOf('s', 9));//Occurrence of char after the specified index
		System.out.println("2nd s "+str.indexOf('s',str.indexOf('s')+1));//2nd occurrence
		System.out.println("3rd s "+str.indexOf('s',str.indexOf('s',str.indexOf('s')+1)+1));//3rd occurrence
		
		System.out.println("index of the word "+str.indexOf("have"));
		System.out.println("index of unidentified word "+str.indexOf("hello"));//-1 means the word is not in the string
		
		System.out.println("**************");
		//string comparison
		System.out.println("Comparison- "+str.equals(str1));//gives false.because,in str1 r is small letter . Java is Case sensitive
		System.out.println("Equals Ignorecase: "+str.equalsIgnoreCase(str1)); 
		
		System.out.println("**************");
		//substring -using starting and ending indexes
		System.out.println("Substring:"+str.substring(4, 9));
		
		System.out.println("**************");
		//trim - before space,between space,after space
		String s = "  Hello World  ";
		System.out.println("Trim:"+s.trim());
		
		System.out.println("**************");
		//replace - old char with new char
		System.out.println("Replaced:"+s.replace(" ", ""));
		String date = "01-10-1993"; //01/10/1993
		System.out.println(date.replace("-", "/"));
		
		System.out.println("**************");
		//split-based on the given char- returns an array
		String s2 = "Hello_World_Test_Selenium";
		String split[] = s2.split("_"); 
		for(int i=0;i<split.length;i++) {
		System.out.println(split[i]);
		}
		
		System.out.println("**************");
		//important interview question - left to right execution - string can concate with any datatype
				String x = "hello";
				String y = "world";
				int a = 100;
				int b = 200;
				System.out.println(x+y);
				System.out.println(a+b);
				System.out.println(x+y+a+b); //helloworld100200 - not helloworld300
				System.out.println(a+b+x+y); //300helloworld
				System.out.println(x+y+(a+b)); //helloworld300
				
				System.out.println("**************");
		//concatinate
		System.out.println("concatinate:"+s.concat(s2));		
		
	}

}
