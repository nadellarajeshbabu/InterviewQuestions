


package stringPrograms;

import java.util.Scanner;

public class StringProg_diff_output {
	public static void main(String[] args) {
		reverseEachWord();
	}

	public static void reverseEachWord() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Sentence :");

		String fs = "";
		String s1 = scan.nextLine();
		String[] s2 = s1.split(" ");

		for (int i = s2.length - 1; i >= 1; i--)
		{
			fs = fs + s2[i] + " ";
		}
		fs = fs + s2[0];
		int n = fs.length();
		System.out.println(n);
		System.out.println(fs);
		scan.close();
	}
}
