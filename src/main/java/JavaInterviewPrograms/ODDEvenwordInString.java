package JavaInterviewPrograms;

public class ODDEvenwordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String d = " abcdefghijklmnopqrstuvwxyz ";
//
//		char[] chars = d.toCharArray();
//
//		for (int i = 0; i < chars.length; i += 2) {
//
//			System.out.println(" even values :" + chars[i]);
//
//		}
//		for (int i = 0; i < chars.length; i += 1) {
//
//			System.out.println("odd values" + chars[i]);
//		}
//		
		
		String dd = " abcdefghijklmnopqrstuvwxyz ";

     	char[] chars = dd.toCharArray();
     	
     	System.out.println("  ***************  even characters ***************  ");

		for (int i = 0; i < chars.length; i += 2) {

			System.out.println(chars[i]);

		}
		
		System.out.println(" *********   odd characters  ***************  ");
		
		for (int i = 1; i < chars.length; i += 2) {

			System.out.println(chars[i]);
		}

	}

}
