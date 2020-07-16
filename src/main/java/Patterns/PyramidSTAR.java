package Patterns;

public class PyramidSTAR {

	public static void main(String[] args) {
//
//		for (int i = 1; i <= 5; i++) {
//
//			for (int j = 1; j <= i; j++) {
//
//				System.out.print("*");
//		}
//		System.out.println();
//	}
		
//		 below pattern
//		*
//		**
//		***
//		****
//		*****
		
//		System.out.println(" *****************      ");
//		int k=1;
//		
//		for(int i=1;i<=5;i++) {
//			
//			for(int j=i;j<=k;j++) {
//				
//				System.out.print(" * ");
//			}
//			
//			k= k+2;
//			System.out.println();
//		}
		
//		below pattern
//		
//		 * 
//		 *  * 
//		 *  *  * 
//		 *  *  *  * 
//		 *  *  *  *  *
		
		
		System.out.println(" *****************      ");
		int k2=2;
		
		for(int i=1;i<=5;i++) {
			
			for(int j=i;j<=k2;j++) {
				
				System.out.print(" * ");
			}
			
			k2= k2+4;
			System.out.println();
		}
		
//		below pattern
//		
//		*  * 
//		 *  *  *  *  * 
//		 *  *  *  *  *  *  *  * 
//		 *  *  *  *  *  *  *  *  *  *  * 
//		 *  *  *  *  *  *  *  *  *  *  *  *  *  * 

		
		
		
	}
}
