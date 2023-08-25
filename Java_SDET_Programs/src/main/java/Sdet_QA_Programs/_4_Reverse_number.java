package Sdet_QA_Programs;

public class _4_Reverse_number {
	//Using algorithm
public static void main(String[] args) {
	//assume revnum =0
	int revnum=0;
	
	//num to be reversed
	int num=12345678 ;
	
	//while loop runs till number is not equal to zero
	while(num !=0) {
	
	revnum = revnum*10+num%10;
	num = num/10;
		
	}
	
	System.out.println(revnum);
	
	
	
	
	
	
}
}
