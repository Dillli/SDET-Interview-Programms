package JavaInterviewPrograms;

public class Countthetotalnumberofcharacters {

	public static void main(String[] args) {

		String s = "dilligadus uperragghgjhmjh";

		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c != ' ')// it will count the characters is not equal empty
			{
				count++;

			}

		}

		System.out.println(" total count of charctes in word is  :" + count);

		/*
		 * String n = " dilligad usuperr agghg jh mjh    ";
		 * 
		 * System.out.println(" using the  trim for string  length  :" +
		 * n.trim()); System.out.println(" without trim length  :" +
		 * n.length());
		 */

	}

}
