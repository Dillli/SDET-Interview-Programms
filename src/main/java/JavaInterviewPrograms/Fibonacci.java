package JavaInterviewPrograms;

public class Fibonacci {

	public static void main(String[] args) {

   int one =0;int two =1; int thr =0;
   
     System.out.println(one + "   " + two);
     
     for(int i =1;i<=10;i++) {
    	 
    	 thr =one+two;
    	 
    	 System.out.println("  "+ thr);
    	 
    	 one =two;
    	 two =thr;
    	 
     }

	}

}
