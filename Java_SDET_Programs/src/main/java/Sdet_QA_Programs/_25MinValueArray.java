package Sdet_QA_Programs;

public class _25MinValueArray {
	public static void main(String[] args) {
		int s[] = { 99822, 44, 7755, 22, 454, 0 };

		int max = s[0];

		for (int x = 0; x < s.length; x++) {
			for (int y = x + 1; y < s.length; y++) {
				if (max < s[y]) {
					max = s[y];
				}
			}

		}
		System.out.println(max);
	}
}
