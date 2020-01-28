package stringPrograms;

import java.util.Scanner;

public class Digits_count_in_String 
{
	public static void main(String[] args) 
	{
		digitsCount();
	}

	public static void digitsCount()
	{
		int count = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a String..");
		String s1 = scan.next();
		for (int i = 0; i <= s1.length() - 1; i++)
		{
			char ch = s1.charAt(i);
			if (Character.isDigit(ch))
			{
				count++;
			}
		}
		System.out.println("Given String: " + s1);
		System.out.println("No of Digits in a String : " + count);
		scan.close();
	}
}
