package Sdet_QA_Programs;

public class Test {
	public static void main(String[] args) {

		int s[] = { 22, 33, 43, 56, 62, 79, 84, 97 };
		int searc = 33;
		int l = 0;
		int h = s.length-1;
		
		boolean flag = false;

		while (h>=l) {
			int mid = (l + h)/2;
			if (s[mid]==searc) {
				System.out.println("found");
				flag = true;
				break;
			}

			else if (searc < s[mid]) {
				
				h = mid - 1;
			}

			else if (searc >s[mid]) {
				l = mid + 1;
			}

		}

		if (flag == false) {
			System.out.println("not found");
		}
	}
}
