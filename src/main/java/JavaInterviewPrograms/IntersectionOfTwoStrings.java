package JavaInterviewPrograms;

public class IntersectionOfTwoStrings {

	public static void main(String[] args) {

		String str1 = "the queen of india is  brown fox queen wants to marry king of ap";
		String str2 = "queen";

		System.out.println("The given string is: " + str1);
		System.out.println("The given mask string is: " + str2);

		String[] act = str2.split("");

		for (int i = 0; i < act.length; i++) {

			if (str1.contains(act[i])) {

				String replace = str1.replace(act[i], "");

				str1 = replace;

			}

		}

		System.out.println("Required string is : " + str1);

	}
}
