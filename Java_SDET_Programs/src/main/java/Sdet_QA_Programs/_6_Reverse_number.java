package Sdet_QA_Programs;

public class _6_Reverse_number {
public static void main(String[] args) {
	//Using String builder class
	
	
	int x= 123450;
	
	//Change int to string
	String num_st = String.valueOf(x);
	
	//Create a object of string buffer using the string
	StringBuilder num= new StringBuilder(num_st);
	
	//use reverse method of string buffer class
	StringBuilder revnum = num.reverse();
	System.out.println(revnum);
	
	
	
	
	
	
}
}
