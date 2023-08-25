package Sdet_QA_Programs;

public class _13CountEvenOdd {
	public static void main(String[] args) {

		// Program to find number of even and odd digits in number

		int x = 223344;
		int evencount = 0;
		int oddcount = 0;

		while (x != 0) {

//Find the last digit of number using mod of 10
			int lastdigit = x % 10;
//Check last digit is even nd increase the even count if it is even 
			if (lastdigit % 2 == 0) {
				evencount++;
			} else {
				oddcount++;
			}
//Eliminate the last digit of number by dividing it by 10 
			x = x / 10;

		}
		System.out.println("evencount:" + evencount + " oddcount:" + oddcount);
	}
}
