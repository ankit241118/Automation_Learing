package Sdet_QA_Programs;

public class _7_Reverse_String {
public static void main(String[] args) {
	//Using String concatenation
	String name = "Ankit";
	String rev ="";
	
	for(int x=name.length()-1;  x>=0; x--) {
		rev=rev+name.charAt(x);
	}
	
	System.out.println(rev);
	
	
	
	
	
	
}
}
