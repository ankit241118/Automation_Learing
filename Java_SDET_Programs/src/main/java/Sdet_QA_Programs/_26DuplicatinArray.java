package Sdet_QA_Programs;

public class _26DuplicatinArray {
	public static void main(String[] args) {
		int s[] = { 822, 44, 7755, 22, 454 ,0,44,66,66};

		for (int x = 0; x < s.length; x++) {
			for (int y = x + 1; y < s.length; y++) {
				if (s[x] == s[y]) {
					System.out.println(s[x]);
				} 
			}

		}

	}
}
