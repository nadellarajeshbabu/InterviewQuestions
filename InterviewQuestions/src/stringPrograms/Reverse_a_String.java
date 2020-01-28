
package stringPrograms;

import java.util.Scanner;

/* 
 * Program to reverse a String....... 
 */
public class Reverse_a_String {

	public static void main(String[] args) {
		reverseString();

	}

	public static void reverseString() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string to reverse...");
		String s1 = scan.next();
		String s2 = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			char ch = s1.charAt(i);
			s2 = s2 + ch;
		}
		System.out.println("Given string : " + s1);
		System.out.println("Reversed String: " + s2);
		scan.close();
	}
}
