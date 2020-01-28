package LogicalQuestions;

/*
 * Factorial of a given number 
 */

import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) 
	{
		factorial();
	}
	public static void factorial()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a integer value to factorial of that number...");
		int n = scan.nextInt();
		int fact = 1;
		for (int i = 1; i <= n; i++)
		{	
			fact = fact * i;
		}
		System.out.println(fact);
		scan.close();
	}
}
