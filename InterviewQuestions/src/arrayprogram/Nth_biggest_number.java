
package arrayprogram;

import java.util.Scanner;

public class Nth_biggest_number {

	public static void main(String[] args)
	{
		nThBiggestNUmber();
	}

	public static void nThBiggestNUmber() 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = scan.nextInt();
		int[] a = new int[size];
		for (int i = 0; i <= a.length - 1; i++)
		{
			System.out.println("Enter the element: ");
			a[i] = scan.nextInt();
		}
		System.out.println("Enter the nth highest: ");
		int nThHighest = scan.nextInt();

		int greaterThan = a.length - nThHighest;
		for (int i = 0; i <= a.length - 1; i++) 
		{
			int countGreaterThan = 0;
			for (int j = 0; j <= a.length - 1; j++) 
			{
				if (a[i] > a[j]) 
				{
					countGreaterThan++;
				}
			}
			if (countGreaterThan == greaterThan)
			{
				System.out.println(nThHighest + " highest element is " + a[i]);
				break;
			}
		}
		scan.close();
	}
}
	