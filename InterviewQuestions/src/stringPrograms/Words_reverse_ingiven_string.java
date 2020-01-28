package stringPrograms;

import java.util.Scanner;

public class Words_reverse_ingiven_string 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = scan.nextLine();
		String[] sArr = s1.split(" ");
		for (int i = 0; i <= sArr.length - 1; i++) 
		{
			String s2 = sArr[i];
			s2 = reverse(s2);
			sArr[i] = s2;
		}
		String fs = "";
		System.out.println("Given String : " + s1);
		System.out.print("Reversed String : ");
		for (int i = 0; i <= sArr.length - 2; i++) 
		{
			fs = fs + sArr[i] + " ";
		}
		fs = fs + sArr[sArr.length - 1];
		System.out.println(fs);
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
