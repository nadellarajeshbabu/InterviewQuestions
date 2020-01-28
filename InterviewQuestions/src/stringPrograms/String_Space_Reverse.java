package stringPrograms;

import java.util.Scanner;

/*
 * reverse each word in a String....
 */
public class String_Space_Reverse 
{
	public static void main(String[] args) 
	{
		reverseEachWord();
	}

	public static void reverseEachWord()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Sentence :");
		String s1 = scan.nextLine();
		String[] s2 = s1.split(" ");
		char c1 = ' ';
		String fs = "";
		for (int i = 0; i <= s2.length - 2; i++) 
		{
			fs = fs + reverse(s2[i]);
			fs = fs + c1;
		}
		fs = fs + s2[s2.length - 1];
		System.out.println("Reverse of words:  " + fs);
		scan.close();
	}

	public static String reverse(String gs) 
	{
		String rev = "";
		for (int i = gs.length() - 1; i >= 0; i--) 
		{
			char ch = gs.charAt(i);
			rev = rev + ch;
		}
		return rev;
	}
}
