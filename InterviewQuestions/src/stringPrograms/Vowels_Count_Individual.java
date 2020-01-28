package stringPrograms;
/*
 * Individual counts of vowels in a String.... 
 */

import java.util.Scanner;

public class Vowels_Count_Individual {

	public static void main(String[] args) {
		vowelCountIndividual();
	}

	public static void vowelCountIndividual() {
		int acount = 0;
		int ecount = 0;
		int icount = 0;
		int ocount = 0;
		int ucount = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string....");
		String s1 = scan.next();
		for (int i = 0; i <= s1.length() - 1; i++) {
			char ch = s1.charAt(i);
			/*
			 * if (ch == 'a') { acount++; } else if (ch == 'e') { ecount++; } else if (ch ==
			 * 'i') { icount++; } else if (ch == 'o') { ocount++; } else if (ch == 'u') {
			 * ucount++; }
			 */
			switch (ch) {
			case 'a':
				acount++;
				break;
			case 'e':
				ecount++;
				break;
			case 'i':
				icount++;
				break;
			case 'o':
				ocount++;
				break;
			case 'u':
				ucount++;
				break;
			}
		}
		System.out.println("a:" + acount);
		System.out.println("e:" + ecount);
		System.out.println("i:" + icount);
		System.out.println("o:" + ocount);
		System.out.println("u:" + ucount);
		scan.close();
	}
}
