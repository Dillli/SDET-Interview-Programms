package JavaInterviewPrograms;



public class ExtractnumberfromString {

	public static void main(String[] args) {
		String str1 = " loveyoulasya143";

		String s = str1.replaceAll("[^0-9]", "");
		
		System.out.println(s);
		
		
		String FF = str1.substring(0, 4);
		String LF = str1.substring(str1.length()-4,str1.length());
		
		System.out.println("  First four values  "+ FF);
		System.out.println("  Last  four values  " + LF);
		

	}

}
