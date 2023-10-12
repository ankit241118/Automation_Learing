package Sdet_QA_Programs;

public class _29Bubble_Sort {public static void main(String[] args) {
	

int s[]= {0,94,5,156,6,6,2};
//Apna college
//Outer loop Jitne element sort krawane utne -1 times chlega
//If it run one time means 1 element is sorted. Biggest element comes to last position
//If it run i times means i elements are sorted
for(int i=0;  i<s.length-1; i++) {

//Inner loop. This will sort the elements. 
//-i is done because i elements are sorted. No need to check them
	for(int j=0;  
			j<s.length-i-1; j++)
	{
		if(s[j]>s[j+1]) {
			int temp=s[j];
			
			s[j]=s[j+1];
			s[j+1]=temp;}}
			
	}
for(int i=0;  i<s.length; i++) {
	System.out.print(" "+s[i]);
}
	
	
	
	
	

}}
