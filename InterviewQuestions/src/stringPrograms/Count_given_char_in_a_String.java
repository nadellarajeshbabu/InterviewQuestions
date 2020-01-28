package stringPrograms;

import java.util.Scanner;

public class Count_given_char_in_a_String 
{
	public static void main(String[] args) 
	{
		countCharacter();
	}

	public static void countCharacter() 
	{
		int count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string data....");
		String s1 = scan.next();
		System.out.println("Enter the character");
		String s2 = scan.next();
		char ch = s2.charAt(0);
		for (int i = 0; i <= s1.length() - 1; i++) {
			char c = s1.charAt(i);
			if (ch == c)
			{
				count++;
			}
		}
		System.out.println("Given String: " + s1);
		System.out.println("Given character: " + ch);
		System.out.println("counts in given character of given string:" + count);
		scan.close();
	}
}
