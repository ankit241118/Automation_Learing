package Sdet_QA_Programs;

public class _34_CountCharacter {
	public static void main(String[] args) {
		// WAP to find count of "a" in this string
		String s = "Hello this is a game";

		int totalcount = s.length();
		System.out.println(totalcount);

		// Remove all the "a" from the string nd find the count

		int countafterremove = s.replace("a", "").length();
		System.out.println(countafterremove);

		// count of "a"
		int count = totalcount - countafterremove;
		System.out.println(count);

	}
}
