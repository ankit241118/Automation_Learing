package Sdet_QA_Programs;

public class _32_RemoveSpecialChAR {
public static void main(String[] args) {
	
	
	String s = "@$@@$$helloHELLO123";
	s=s.replaceAll("[^a-z]", "");
	System.out.println(s);
	
	String s1 = "@$@@$$helloHELLO123";
	s1=s1.replaceAll("[^a-zA-Z]", "");
	System.out.println(s1);
	
	String s3 = "@$@@$$helloHELLO123";
	s3=s3.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(s3);
}
}
