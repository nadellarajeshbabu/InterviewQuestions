package arrayprogram;

import java.util.Scanner;

public class Sorting_an_Array {
	public static void main(String[] args) {
		arraySorting();
	}

	public static void arraySorting()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = scan.nextInt();
		int[] a = new int[n];
		int temp = 0;
		System.out.println("Enter " + n + " elements of array: ");
		for (int i = 0; i <= a.length - 1; i++)
		{
			System.out.println("Enter the element : ");
			a[i] = scan.nextInt();
		}
		System.out.println("Entered elements of array are:");
		for (int i = 0; i <= a.length - 1; i++)
		{
			System.out.println(a[i]);
		}

		for (int c = 1; c <= a.length - 1; c++)
		{
			for (int i = 0; i <= a.length - 2; i++) 
			{
				if (a[i] > a[i + 1]) 
				{
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
				}
			}
		}
		System.out.println("Sorted elements of array are:");
		for (int i = 0; i <= a.length - 1; i++)
		{
			System.out.println(a[i]);
		}
		scan.close();
	}
}
