package stringPrograms;

/*
 * Check whether the string is Palindrome or not....
 */
import java.util.Scanner;

public class Palindrome_for_string
{
	public static void reverseString()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String data to revese...");
		String s1 = scan.next();
		String s2 = "";
		// Below tocharArray() is used to convert string to character array....
		char[] c1 = s1.toCharArray();
		for (int i = c1.length - 1; i >= 0; i--) 
		{
			
			char c = c1[i];
			s2 = s2 + c;
		}
		System.out.println("Given String : " + s1);
		System.out.println("Revesed String : " + s2);
		if (s2.equalsIgnoreCase(s1))
		{
			System.out.println("String is palindrome..");
		} 
		else
		{
			System.out.println("String is not a Palindrome...");
		}
		scan.close();
	}

	public static void main(String[] args) 
	{
		reverseString();
	}
}

