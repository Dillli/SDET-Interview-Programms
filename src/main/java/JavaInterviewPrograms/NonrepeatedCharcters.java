package JavaInterviewPrograms;

import java.util.HashMap;
import java.util.Set;

public class NonrepeatedCharcters {

	public static void main(String[] args) {
		
		String str = "programming";

		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {

			char characters = str.charAt(i);

			if (!hashMap.containsKey(characters)) {

				hashMap.put(characters, 1);

			}

			else {

				hashMap.put(characters, hashMap.get(characters) + 1);
			}
		}

		System.out.println(hashMap);
		
		
		
		
		Set<Character> ch = hashMap.keySet();

		for (Character c : ch) {

			if (hashMap.get(c).equals(1)) {

				System.out.println("The Word " + c + " appeared " + hashMap.get(c)+ " Times.");
		
			}
		}

	}

}
