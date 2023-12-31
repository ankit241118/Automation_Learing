package Sdet_QA_Programs;

import java.util.Arrays;

public class _28BinarySearch {
	public static void main(String[] args) {
//For binary search array should be sorted
//In linear search we do not require sorted array
		int s[] = { 33, 55, 80, 95, 130, 140 };
		int search_num = 33;

		int lowerlimit = 0;
		int higherlimit = s.length - 1;
		boolean flag = false;

		// Loop should stop when higherlimit<lowerlimit

		while (higherlimit >= lowerlimit) {

			int midvalue = (lowerlimit + higherlimit) / 2;

			if (s[midvalue] == search_num) {
				System.out.println("Element found at index: " + midvalue);
				flag = true;
				break;

			}

			else if (s[midvalue] < search_num) {
				lowerlimit = midvalue + 1;

			} else if (s[midvalue] > search_num) {
				higherlimit = midvalue - 1;

			}

		}

		if (flag == false) {
			System.out.println("Element not found");
		}

	
	//biNARY search using arrays class
	int index=Arrays.binarySearch(s, 55);
	System.out.println(index);
}}
