package arrayprogram;

import java.util.Scanner;

/*
 * find the first biggest element without sorting:
 */
public class Find_firstBiggest_element_Without_sorting 
{

	public static void main(String[] args) 
	{
		biggestElement();
	}

	public static void biggestElement() 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = scan.nextInt();
		int[] a = new int[n];

		System.out.println("Enter " + n + " elements of array: ");
		for (int i = 0; i <= a.length - 1; i++) 
		{
			System.out.println("Enter the element : ");
			a[i] = scan.nextInt();
		}
		int big = a[0];
		for (int i = 1; i <= a.length - 1; i++)
		{
			if (a[i] > big)
			{
				big = a[i];
			}
		}
		System.out.println("Entered elements of array are:");
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println(a[i]);
		}
		System.out.println("First biggest element of array is: " + big);
		scan.close();
	}
}
