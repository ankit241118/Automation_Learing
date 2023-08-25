package Sdet_QA_Programs;

public class _24EqualityOfTwoArray {
	public static void main(String[] args) {
		int a[] = { 4, 3, 4, 5, 6, 6 };
		int b[] = { 4, 3, 4, 5, 6, 6 };
		boolean flag = true;

		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
                 
					flag = false;
				}
			}
			if (flag == false) {
				System.out.println("Array not equal");
			} else {
				System.out.println("Array equal");
			}
		}

		else {
			System.out.println("Array size not equal");
		}
	}
}
