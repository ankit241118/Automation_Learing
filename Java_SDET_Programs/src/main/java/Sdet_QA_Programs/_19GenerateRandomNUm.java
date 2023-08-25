package Sdet_QA_Programs;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class _19GenerateRandomNUm {
public static void main(String[] args) {
	
	//Use random class to generate random class
	Random rd = new Random();
	
	//Use nextInt method of random class
	int num=rd.nextInt(100000);
	System.out.println(num);
	
	//Apache common lang libraby
	//Download apache lang dependency
	//Use RandomStringUtil Class
	RandomStringUtils st = new RandomStringUtils();
	System.out.println(st.randomAlphabetic(8,8));
	System.out.println(st.randomNumeric(8));
	

	
	
	//Use math class
	
	
	
	
}
}
