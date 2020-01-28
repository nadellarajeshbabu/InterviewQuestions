package LogicalQuestions;

import java.util.Scanner;

public class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		armstrongNumber();
	}

	public static void armstrongNumber()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Integer to check Armstrong Number or not...");
		int n = scan.nextInt();

		int sum = 0;
		int rem = 1;
		int count = 0;
		int temp = n;
		int check = n;
		int ld = 0;

		while (n != 0)
		{
			n = n / 10;
			count++;
		}
		while (temp != 0) 
		{
			ld = temp % 10;
			for (int i = 1; i <= count; i++)
			{
				rem = rem * ld;
			}
			sum = sum + rem;
			rem = 1;
			temp /= 10;
		}
		if (sum == check)
		{
			System.out.println(sum + " is a an Armstrong Number....");
		} 
		else
		{
			System.out.println(sum + " is not a Armstrong Number....");
		}
		scan.close();
	}
}
