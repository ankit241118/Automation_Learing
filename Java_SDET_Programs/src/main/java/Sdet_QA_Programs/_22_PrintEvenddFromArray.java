package Sdet_QA_Programs;

public class _22_PrintEvenddFromArray {
public static void main(String[] args) {
	int set[]= {112,2,3,4,5,6,734};
	
for(int i=0; i<=set.length-1; i++) {
	
	if(set[i]%2==0) {
		System.out.println(set[i]+" is even");
	}
	else{
		System.out.println(set[i]+" is odd");
	}
}
}
}
