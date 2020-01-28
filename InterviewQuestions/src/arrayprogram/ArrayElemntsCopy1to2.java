package arrayprogram;

import java.util.Scanner;

public class ArrayElemntsCopy1to2 
{
	public static void main(String[] args)
	{
		copyElements();
	}

	public static void copyElements()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = scan.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		System.out.println("Enter the elements of array");
		for (int i = 0; i <= a.length - 1; i++)
		{
			System.out.println("enter the element: ");
			a[i] = scan.nextInt();
		}
		System.out.println("=============================================");
		System.out.println("Elements copied from 1 array to another array : ");
		for (int i = 0; i <= a.length - 1; i++) 
		{
			b[i] = a[i];
			System.out.println(b[i]);
		}
		scan.close();
	}
}
