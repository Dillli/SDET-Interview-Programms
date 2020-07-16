package JavaInterviewPrograms;

public class ReversingString
{
	public static void main(String[] args)
	{
		//1. Using For-Loop
		//String is Immutable - We do not have reverse() function in String
		/*String sem = "Hello World";
		
		int len = sem.length();
		
		System.out.println(len);
		
		String rev = "";
		
		for(int i=len-1; i>=0; i--)
		{
			rev = rev + sem.charAt(i);
		}
		System.out.println(rev);*/
		
		//2. Using StringBuffer Class
		//StringBuffer is Mutable.
//		StringBuffer s1 = new StringBuffer(sem);
//		System.out.println(s1.reverse());
		
	
		String s = "Dileep Bandi";
		String word = "";
		
		String[]  arr =s.split(" ");
		
		for(int i=arr.length-1;i>=0;i--) {
			
			word = word+arr[i]+" ";
			
					}
		System.out.print(word  + " ");

}
}
