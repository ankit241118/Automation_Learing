package Sdet_QA_Programs;

public class _10_CheckNumIsPallindrome {

//If num and reverse of num are same then num is pallindrome
	public static void main(String[] args) {
		int x = 10001;
		int y = x;

		int rev = 0;

		while (x != 0) {
			rev = rev * 10 + x % 10;
			x = x / 10;

		}

		if (y == rev) {
			System.out.println(y + " is pallindrome");
		} else {
			System.out.println(y + " is not pallindrome");
		}

	}
}
