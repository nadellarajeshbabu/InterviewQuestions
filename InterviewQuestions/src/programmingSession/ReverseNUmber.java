package programmingSession;

import java.util.Scanner;

public class ReverseNUmber {
	public static void main(String[] args) {
		int n = 456;
		int rem = 0;
		int rev = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n = sc.nextInt();
		while (n != 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		System.out.println(rev);
	}

}
