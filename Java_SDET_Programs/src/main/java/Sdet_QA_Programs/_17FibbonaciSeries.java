package Sdet_QA_Programs;

public class _17FibbonaciSeries {
	public static void main(String[] args) {

		int num = 5;

		int x = 0;
		int y = 1;
		int z;

		System.out.print(" " + x);

		System.out.print(" " + y);
//0 1 1 
		for (int i = 0; i <= num; i++) {
			z = x + y; 
			System.out.print(" " + z);
			int a = x;
			x = y; 
			y = z; 

		}
	}
}
