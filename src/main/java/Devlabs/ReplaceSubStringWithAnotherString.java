package Devlabs;

public class ReplaceSubStringWithAnotherString {

	public static void main(String[] args) {
		String str = "Learn, Lead and Succeed in DevLabsAlliance";
		String toBeReplaced = "in";
		String toReplacedWith = "with";

		String[] astr = str.split(toBeReplaced);

		System.out.println(" length of a str  " + astr.length);

		StringBuffer strb = new StringBuffer();

		for (int i = 0; i <= astr.length - 1; i++) {
			strb = strb.append(astr[i]);
			System.out.println(" **  astr  ******" + strb);
			if (i != astr.length - 1) {
				strb = strb.append(toReplacedWith);
			}
		}

		System.out.println(strb);
	}

}
