package stringPrograms;

import java.util.Scanner;

public class Digits_n_index_value_in_string
{
	public static void main(String[] args) 
	{
		digits_n_Index_Display();
	}

	public static void digits_n_Index_Display() 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String: ");
		String a = scan.nextLine();
		System.out.println("Entered digits and its index numbers ");
		System.out.println("Digit:Index Position");
		for (int i = 0; i <= a.length() - 1; i++) 
		{
			char ch = a.charAt(i);
			
			if (Character.isDigit(ch))
			{
				System.out.println(ch + "    : " + i);
			}

		}
		scan.close();
	}

}
