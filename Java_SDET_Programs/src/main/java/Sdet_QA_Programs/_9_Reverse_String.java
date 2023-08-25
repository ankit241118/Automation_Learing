package Sdet_QA_Programs;

public class _9_Reverse_String {
	public static void main(String[] args) {
		// Using String buffer
		String name = "Ankit";
		
//Create string buffer object and pass the string
		StringBuffer b = new StringBuffer(name);
	
		
//Use reverse method og string buffer class to reverse
        StringBuffer rev = b.reverse();
        System.out.println(rev);
		

	}
}
