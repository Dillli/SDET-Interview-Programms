package javaProgram;

public class SwappingNumbers {

	public static void main(String[] args) {
 
		int x = 5;
		int y = 9;
		
//		//1.using temp variable
//		int t = x;//5
//		x = y;//9
//		y = t;//5
//		System.out.println(x+"  "+y);//9 5
//		
//		//2.using + operator
//		x = x + y;//14
//		y = x - y;//5
//		x = x - y;//9
//		System.out.println(x+"  "+y);//9 5
//		
//		//3.using * operator
//		x = x * y;//45
//		y = x / y;//5
//		x = x / y;//9
//		System.out.println(x+"  "+y);//9 5
		
		//4.using XOR
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		System.out.println(x+"  "+y);
		
	}

}
