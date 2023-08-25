package Sdet_QA_Programs;

public class _14_SumOfDigits {
//Find the sum of digits of a number
	public static void main(String[] args) {

		int num = 1345;
		int sum = 0;

		while (num != 0) {
//Find the last digit of num using mod of 10
			int lastdigit = num % 10;

//add last digit to sum
			sum = sum + lastdigit;
//Eliminate the last digit by dividing the number by 10
			num = num / 10;
		}

		System.out.println("Sum of digits " + sum);
	}
}
