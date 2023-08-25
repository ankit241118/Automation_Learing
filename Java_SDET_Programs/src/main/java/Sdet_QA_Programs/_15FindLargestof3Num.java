package Sdet_QA_Programs;

public class _15FindLargestof3Num {
public static void main(String[] args) {
//Find largest number of given 3 numbers using ternary operater
int x =412;
int y =944;
int z =9133;

//variable = (condition) ? value1 : value2  
//if condition=true then variable=value1
//if condition=false then variable=value2
int a=(x>y)?x:y;
int a1=(a>z)?a:z;

System.out.println(a1);




}
}
