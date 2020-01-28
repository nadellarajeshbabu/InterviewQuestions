package stringPrograms;

import java.util.Scanner;

public class CompareSubstring_with_String 
{
	public static void main(String[] args)
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println("This program checks whether first string is substring of second or vice-versa.... ");
		System.out.println("Enter the string :");
		String s1 = scanner.next();
		System.out.println("Enter another String: ");
		String s2 = scanner.next();
		String s3 = "";
		
		//below contains() checks s2 string in s1 string or not.....
		if(s1.contains(s2) || s2.contains(s1))
		{
			for(int i=0;i<=s1.length()-1;i++)
			{
				char ch = s1.charAt(i);
				int k = s2.indexOf(ch);
				if(k==-1)
				{
					s3=s3+ch;
				}
			}
		}
		else
		{
			System.out.println("-1");
		}
		System.out.println("characters other than substring characters are printed as a string: "+s3);
		scanner.close();
	}

}
