package stringPrograms;

import java.util.Scanner;

public class WordsCount {

	public static void main(String[] args) {
		reverse();
	}

	public static void reverse()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string data:");
		String s1 = scan.nextLine();
		String s2 = "";
		String fs = "";
		String rev = "";
		for (int i = 0; i <= s1.length() - 1; i++)
		{
			char ch = s1.charAt(i);
			if (ch != ' ')
			{
				s2 = s2 + ch;
			}
			else
			{
				for (int j = s2.length() - 1; j >= 0; j--)
				{
					char c = s2.charAt(j);
					rev = rev + c;
					s2 = "";
				}
				fs = fs + rev;
				fs = fs + ch;
				s2 = "";
			}
		}
		System.out.println("Given String: " + s1);
		System.out.println("Reversed String: " + fs);
		scan.close();
	}
}
