package Sdet_QA_Programs;

public class _27LinearSearcArray {
	public static void main(String[] args) {
		int s[] = { 22, 44, 55, 66, 33 };
		int search_ele = 443;
		boolean flag = false;
		int i;

		for (i = 0; i < s.length; i++) {
			if (search_ele == s[i]) {
				flag = true;
				break;
			}
		}

		if (flag == true) {
			System.out.println("Element found at index " + i);
		} else {
			System.out.println("Element not found");
		}

	}
}
