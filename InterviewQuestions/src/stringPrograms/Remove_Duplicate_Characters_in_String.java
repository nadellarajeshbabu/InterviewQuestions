package stringPrograms;

import java.util.Scanner;

public class Remove_Duplicate_Characters_in_String 
{
	public static void main(String[] args) 
	{
		removeDuplicateCharacters();
	}

///use indexOf();
	public static void removeDuplicateCharacters() 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s1 = scan.nextLine();
		String s2 = "";
		for (int i = 0; i <= s1.length() - 1; i++) {
			char ch = s1.charAt(i);
			int k = s2.indexOf(ch);
			if (k == -1) {
				s2 = s2 + ch;
			}
		}
		System.out.println("Given String: " + s1);
		System.out.println("String after removal of duplicate characters: " + s2);
		scan.close();
	}
}
