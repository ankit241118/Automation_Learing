package Sdet_QA_Programs;

public class _20Factorial {
public static void main(String[] args) {
	int num =4;
	int fact=1;
	
	for(int i=1; i<=num; i++) {
		fact= fact*i;
	}
	System.out.println(fact);
}
}
