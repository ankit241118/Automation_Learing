package Sdet_QA_Programs;

public class _1_Swap_Two_Var {
   //Witout using third variable
	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		System.out.println("Before swap: "+"x:"+x+" "+"y:"+y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("After swap: "+"x:"+x+" "+"y:"+y);
		
		
		
		
		
	}

}
