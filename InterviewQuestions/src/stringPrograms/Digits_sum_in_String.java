
package stringPrograms;

import java.util.Scanner;

public class Digits_sum_in_String {

	public static void main(String[] args) {
		digitSum();
	}

	public static void digitSum() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String a = scan.nextLine();
		int sum = 0;
		// System.out.println("Digits and its index numbers ");
		for (int i = 0; i <= a.length() - 1; i++) {
			char ch = a.charAt(i);
			if (Character.isDigit(ch)) {
				String c = ch + "";
				int n = Integer.parseInt(c);
				sum = sum + n;
			}
		}
		System.out.println("Sum of the digits in a String: " + sum);
		scan.close();
	}
}
