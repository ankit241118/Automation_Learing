package Sdet_QA_Programs;

public class _33RemoveWhiteSpace {
public static void main(String[] args) {
	
	String s = "Hello Ankit This is a good day";
	
	s=s.replaceAll("\\s", "");
	System.out.println(s);
}
}
