package Sdet_QA_Programs;

public class _8_Reverse_String {
	public static void main(String[] args) {
		// Using character array
		String name = "Ankit";
		String rev = "";

//Convert string to char array using toChararray method of string class	
		char s[] = name.toCharArray();

		for (int x = name.length() - 1; x >= 0; x--) {
			rev = rev + s[x];
		}

		System.out.println(rev);

	}
}
