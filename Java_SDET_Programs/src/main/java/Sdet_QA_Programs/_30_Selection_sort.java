package Sdet_QA_Programs;

public class _30_Selection_sort {

	public static void main(String[] args) {
		int x[] = {33, 44, 66, 42, 65, 21,99 };

		for (int i = 0; i< x.length - 1; i++) {

			int min = i;
			for (int j = i + 1; j < x.length; j++) {
				if (x[min] > x[j]) {
					min = j;
			}}
			
			
			int temp = x[min];
			x[min] = x[i];
			x[i] = temp;
		}
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}

		
	}
}
