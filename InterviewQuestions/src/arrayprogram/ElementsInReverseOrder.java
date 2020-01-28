package arrayprogram;

import java.util.Scanner;

public class ElementsInReverseOrder 
{
	public static void main(String[] args)
	{
		reverseOrder();
	}

	public static void reverseOrder()
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

		System.out.println("reverse Order: ");
		for (int i = a.length - 1; i >= 0; i--) 
		{
			System.out.println(a[i]);
		}
		scan.close();
	}
}
