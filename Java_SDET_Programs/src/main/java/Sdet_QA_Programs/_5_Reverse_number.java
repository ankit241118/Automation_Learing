package Sdet_QA_Programs;

public class _5_Reverse_number {
public static void main(String[] args) {
	//Using String buffer class
	
	
	int x= 123456;
	
	//Change int to string
	String num_st = String.valueOf(x);
	
	//Create a object of string buffer using the string
	StringBuffer num= new StringBuffer(num_st);
	
	//use reverse method of string buffer class
	StringBuffer revnum = num.reverse();
	System.out.println(revnum);
	
	
	
	
	
	
}
}
