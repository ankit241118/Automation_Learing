package Sdet_QA_Programs;

public class _18CheckNumPrime {
	public static void main(String[] args) {

		int num = 232;
		boolean flag = true;

		if (num == 0 || num == 1) {
			System.out.println("Not prime");
		}

		else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					flag = false;
				}
			}

			System.out.println(flag);
			if (flag == false) {
				System.out.println("Num is not prime");
			} else if (flag == true) {
				System.out.println("Num is prime");
			}

		}
	}
}
