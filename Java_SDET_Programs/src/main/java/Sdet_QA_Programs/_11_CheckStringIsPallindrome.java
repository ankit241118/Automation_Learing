package Sdet_QA_Programs;

public class _11_CheckStringIsPallindrome {

//If String and reverse of string are same then string is pallindrome
	public static void main(String[] args) {
		String s = "qqqqqqqqq";
		 
		String rev="";
		
		
		for(int i=s.length()-1; i>=0; i--) {
			rev=rev+s.charAt(i);
			
			
		}
		
		if(s.equalsIgnoreCase(rev)) {System.out.println("String is pallindrome");}
		else{System.out.println("String is not pallindrome");}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
