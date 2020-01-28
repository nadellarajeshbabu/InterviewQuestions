package LogicalQuestions;

import java.util.Scanner;

public class Leap_Year 
{
	public static void main(String[] args)
	{
		leapYear();
	}

	public static void leapYear()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an Year: ");
		int n = scan.nextInt();

		if (n % 400 == 0) 
		{
			System.out.println(n + " is a leap year....");
		} 
		else if (n % 100 == 0) 
		{
			System.out.println(n + " is not a leap year....");
		}
		else if (n % 4 == 0) 
		{
			System.out.println(n + " is a leap year....");
		}
		else
		{
			System.out.println(n + " is not a Leap year.....");
		}
		scan.close();
	}

}
