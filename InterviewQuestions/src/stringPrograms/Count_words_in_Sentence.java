package stringPrograms;

import java.util.Scanner;

/*
 * program to count no of words present in a given sentence...
 */
public class Count_words_in_Sentence 
{
	public static void main(String[] args) 
	{
		displayCount();
	}

	public static void displayCount()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Sentence: ");
		String s1 = scan.nextLine();
		int count = 0;
		String[] s2 = s1.split(" ");

		// here by using split(" ");also we can find no of words in a string....

		for (int i = 0; i <= s1.length() - 1; i++) 
		{
			char ch = s1.charAt(i);
			if (ch == ' ')
			{
				count++;
			}
		}
		int n = count + 1;
		System.out.println("Size of s1 : " + s2.length);
		System.out.println("Given Sentene : " + s1);
		System.out.println("No of Words in given string: " + n);
		scan.close();
	}
}
