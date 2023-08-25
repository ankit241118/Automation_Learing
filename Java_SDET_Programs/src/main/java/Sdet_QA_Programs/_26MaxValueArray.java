package Sdet_QA_Programs;

public class _26MaxValueArray {
	public static void main(String[] args) {
		int s[] = { 822, 44, 7755, 22, 454 ,0};

		int min = s[0];

		for (int x = 0; x < s.length; x++) {
			for (int y = x + 1; y < s.length; y++) {
				if (min > s[y]) {
					min = s[y];
				}
			}

		}
		System.out.println(min);
	}
}
