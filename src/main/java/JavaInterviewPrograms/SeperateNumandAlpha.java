package JavaInterviewPrograms;

public class SeperateNumandAlpha {

	public static void main(String[] args) {
		String alpha = " ";
		String num = " ";

		String spl = " ";

		String s = " dilli gadi number 90144459944 £#%^&( ";

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);

			if (Character.isDigit(c)) {

				num = num + c;
			}

			else if (Character.isAlphabetic(c)) {

				alpha = alpha + c;

			}

			else {

				spl = spl + c;
			}

		}

		System.out.println(" string separeted alpha  are  :" + alpha);
		System.out.println(" string separeted digits  are  :" + num);
		System.out.println(" string separeted special are  :" + spl);
		
		//aaaaabbbbbbbbbbbbbbbbcdddddddddddd ==== to print c
		
		
		String n = " aaaaabbbbbbbbbbbbbbbbcdddddddddddd  ";
		
		System.out.println(" to print single charcter is : "+ n.charAt(n.indexOf("d")));

	}

}
