package Sdet_QA_Programs;

public class _12_CountDigitInNumn {
public static void main(String[] args) {
	
	//Count number of digits in a number
	int num = 12345;
	int count=0;
	
	while(num !=0) {
		num = num/10;
		count++;
	}
	System.out.println(count);
}
}
