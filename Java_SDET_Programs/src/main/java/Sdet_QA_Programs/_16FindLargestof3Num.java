package Sdet_QA_Programs;

public class _16FindLargestof3Num {
public static void main(String[] args) {
//Find largest number of given 3 numbers
int x =412;
int y =44;
int z =133;


if(x>y && x>z) {
	System.out.println(x+" : x is largest");
}

else if(y>x && y>z) {
	System.out.println(y+" : y is largest");
}

else if(z>x && z>y) {
	System.out.println(z+" : z is largest");
}


}
}
