package arrayprogram;

import java.util.Scanner;

public class ArrayNumberSum 
{
	public static void main(String[] args)
	{
		sum();
	}

	public static void sum()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the Array size: ");
		int n = scan.nextInt();
		System.out.println("Enter the Array elements: ");
		int[] a = new int[n];
		int sum = 0;
		for (int i = 0; i <= a.length - 1; i++)
		{
			a[i] = scan.nextInt();
		}
		for (int i = 0; i <= a.length - 1; i++) {
			sum = sum + a[i];
		}
		System.out.println("Sum of array elements is : " + sum);
		scan.close();
	}

}
