package Sdet_QA_Programs;

import java.util.Arrays;

public class _23EqualityOfTwoArray {
	public static void main(String[] args) {
		int a[] = { 4, 3, 4, 5, 6, 6 };
		int b[] = { 42, 3, 4, 5, 6, 6 };

		boolean flag = Arrays.equals(a, b);
		if (flag == true) {
			System.out.println("Arrays are equal");
		} else if (flag == false) {
			System.out.println("Arrays are not equal");
		}

	}
}
